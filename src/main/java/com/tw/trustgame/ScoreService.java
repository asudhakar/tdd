package com.tw.trustgame;

import java.util.Arrays;
import java.util.List;

public class ScoreService {
    public static List<Integer> calculateScoreForCoOperativeCoOperativeCombination(ScoreService scoreService, Integer integer) {
        return Arrays.asList(2,2);
    }
    public static List<Integer> calculateScoreForCheaterCheaterCombination(ScoreService scoreService, Integer integer) {
        return Arrays.asList(0,0);
    }
    public static List<Integer> calculateScoreForCoOperativeCheaterCombination(ScoreService scoreService, Integer integer) {
        return Arrays.asList(-1,3);
    }
    public static List<Integer> calculateScoreForCheaterCoOperativeCombination(ScoreService scoreService, Integer integer) {
        return Arrays.asList(3,-1);
    }

    public List<Integer> updateScore(Combination combination) {
        return combination.score.apply(this, null);
    }


}
