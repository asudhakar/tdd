package com.tw.trustgame;

public class Cheater extends Player {
    public Cheater() {
        super();
    }

    @Override
    public String getBehaviour() {
        return  behaviour.get(0);
    }
}
