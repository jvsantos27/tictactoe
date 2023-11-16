package com.system.tictactoe.controllers;

import com.system.tictactoe.dtos.TictactoeDto;
import com.system.tictactoe.models.TictactoeModel;
import com.system.tictactoe.service.TictactoeService;
import org.apache.coyote.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/tictactoe-game")
public class TictactoeController {

    final TictactoeService tictactoeService;

    public TictactoeController(TictactoeService tictactoeService) {
        this.tictactoeService = tictactoeService;
    }

    @PostMapping
    public ResponseEntity<Object> saveTictactoeGame(@RequestBody @Valid TictactoeDto tictactoeDto) {
        var tictactoeModel = new TictactoeModel();
        BeanUtils.copyProperties(tictactoeDto, tictactoeModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(tictactoeService.save(tictactoeModel));
    }

    @GetMapping
    public ResponseEntity<List<TictactoeModel>> getAllTictactoeGame(){
        return ResponseEntity.status(HttpStatus.OK).body(tictactoeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneTictactoeGame(@PathVariable(value= "id") UUID id){
        Optional<TictactoeModel> tictactoeModelOptional = tictactoeService.findById(id);
        if(!tictactoeModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Tictactoe game not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(tictactoeModelOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteTictactoeGame(@PathVariable(value="id") UUID id){
        Optional<TictactoeModel> tictactoeModelOptional = tictactoeService.findById(id);
        if(!tictactoeModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Tictactoe game not found");
        }
        tictactoeService.delete(tictactoeModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Tictactoe game deleted succesfully.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateTictactoeGame(@PathVariable(value= "id") UUID id, @RequestBody @Valid TictactoeDto tictactoeDto){
        Optional<TictactoeModel> tictactoeModelOptional = tictactoeService.findById(id);
        if(!tictactoeModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Tictactoe game not found.");
        }
        var tictactoeModel = tictactoeModelOptional.get();
        tictactoeModel.setPlayer1(tictactoeDto.getPlayer1());
        tictactoeModel.setPlayer2(tictactoeDto.getPlayer2());
        tictactoeModel.setPointsJ1(tictactoeDto.getPointsJ1());
        tictactoeModel.setPointsJ2(tictactoeDto.getPointsJ2());
        return ResponseEntity.status(HttpStatus.OK).body(tictactoeService.save(tictactoeModel));
    }
}

