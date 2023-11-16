package com.system.tictactoe.repositories;

import com.system.tictactoe.models.TictactoeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TictactoeRepository  extends JpaRepository <TictactoeModel, UUID> {

}
