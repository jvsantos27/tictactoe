package com.system.tictactoe.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;


@Entity
@Table(name= "TB_TICTACTOE")
public class TictactoeModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String player1;
    @Column(nullable = false, unique = true, length = 10)
    private String player2;
    @Column(nullable = false, unique = true)
    private Integer pointsJ1;
    @Column(nullable = false, unique = true)
    private Integer pointsJ2;
    @Column(nullable = false)
    private char[][] board;

    public TictactoeModel() {
        this.board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public Integer getPointsJ1() {
        return pointsJ1;
    }

    public void setPointsJ1(Integer pointsJ1) {
        this.pointsJ1 = pointsJ1;
    }

    public Integer getPointsJ2() {
        return pointsJ2;
    }

    public void setPointsJ2(Integer pointsJ2) {
        this.pointsJ2 = pointsJ2;
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }
}
