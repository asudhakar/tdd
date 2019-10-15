package com.tw.trustgame;

import java.util.List;
import java.util.function.BiFunction;

public enum Combination {
    COOPERATIVECOOPERATIVE(ScoreService::calculateScoreForCoOperativeCoOperativeCombination),
    COOPERATIVECHEATER(ScoreService::calculateScoreForCoOperativeCheaterCombination),
    CHEATERCHEATER(ScoreService::calculateScoreForCheaterCheaterCombination),
    CHEATERCOOPERATIVE(ScoreService::calculateScoreForCheaterCoOperativeCombination);

    public final BiFunction<ScoreService, Integer, List<Integer>> score;

    private Combination(BiFunction<ScoreService, Integer, List<Integer>> score) {
        this.score = score;
    }

}
