package com.tw.trustgame;

import java.util.List;
import java.util.stream.IntStream;

public class Game {

    private static final String COOPERATIVE = "COOPERATIVE";
    private static final String CHEATER = "CHEATER";
    private Player player1;
    private Player player2;
    private int rounds;

    public Game(Player player1, Player player2, int rounds) {
        this.player1 = player1;
        this.player2 = player2;
        this.rounds = rounds;
        this.start();
    }

    private void start() {
        IntStream.range(0, rounds).forEach(i -> updateScore() );
    }

    private void updateScore() {
        ScoreService scoreService = new ScoreService();
        List<Integer> score = scoreService.updateScore(Combination.valueOf(player1.getBehaviour()+player2.getBehaviour()));
        player1.score(score.get(0));
        player2.score(score.get(1));
    }

}
