package com.tw.trustgame;

import java.util.Scanner;

public class ScannerWrapper {

    public String readInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
