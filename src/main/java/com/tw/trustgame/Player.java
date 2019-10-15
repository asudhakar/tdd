package com.tw.trustgame;

import java.util.Arrays;
import java.util.List;

public abstract class Player {

    List<String> behaviour = Arrays.asList("CHEATER", "COOPERATIVE");
    int score;

    public Player() {

    }

    public abstract String getBehaviour();

    public int score (int score) {
        return this.score+=score;
    }

    public int getScore() {
        return score;
    }
}
