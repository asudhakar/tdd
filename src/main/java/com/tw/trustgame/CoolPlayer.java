package com.tw.trustgame;

public class CoolPlayer extends Player {
    public CoolPlayer() {
        super();
    }

    @Override
    public String getBehaviour() {
        return  behaviour.get(1);
    }
}
