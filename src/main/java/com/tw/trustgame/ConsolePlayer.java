package com.tw.trustgame;

public class ConsolePlayer extends Player {
    ScannerWrapper scannerWrapper;

    public ConsolePlayer(ScannerWrapper scannerWrapper) {
        this.scannerWrapper = scannerWrapper;
    }
    @Override
    public String getBehaviour() {
        return  behaviour.get(scannerWrapper.readInput().equals("CH") ? 0 : 1);
    }
}
