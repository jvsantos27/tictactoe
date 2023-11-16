package com.system.tictactoe.dtos;

import javax.validation.constraints.NotNull;

public class TictactoeDto {
    @NotNull
    private String player1;
    @NotNull
    private String player2;
    @NotNull
    private Integer pointsJ1;
    @NotNull
    private Integer pointsJ2;

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
}
