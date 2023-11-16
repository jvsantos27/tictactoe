package com.system.tictactoe.service;

import com.system.tictactoe.models.TictactoeModel;
import com.system.tictactoe.repositories.TictactoeRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TictactoeService {

    final TictactoeRepository tictactoeRepository;

    public TictactoeService(TictactoeRepository tictactoeRepository){
        this.tictactoeRepository = tictactoeRepository;
    }

    @Transactional
    public TictactoeModel save(TictactoeModel tictactoeModel) {
        return tictactoeRepository.save(tictactoeModel);
    }

    public List<TictactoeModel> findAll() {
        return tictactoeRepository.findAll();
    }

    public Optional<TictactoeModel> findById(UUID id) {
        return tictactoeRepository.findById(id);
    }

    @Transactional
    public void delete(TictactoeModel tictactoeModel) {
        tictactoeRepository.delete(tictactoeModel);
    }
}