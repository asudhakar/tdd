package com.tw.trustgame;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    @Mock
    ScannerWrapper scannerWrapper;

    @Test
    public void shouldReturnDrawEqualScoreIfCoolPlayer() {
        Player player1 = new CoolPlayer();
        Player player2 = new CoolPlayer();
        new Game(player1, player2, 5);
        Assert.assertEquals(10, player1.getScore(), 0.1);
        Assert.assertEquals(10, player2.getScore(), 0.1);
    }

    @Test
    public void shouldReturnDrawEqualScoreIfCheatPlayer() {
        Player player1 = new Cheater();
        Player player2 = new Cheater();
        new Game(player1, player2, 5);
        Assert.assertEquals(0, player1.getScore(), 0.1);
        Assert.assertEquals(0, player2.getScore(), 0.1);
    }

    @Test
    public void shouldReturnHigherScoreForCheatingPlayer() {
        Player player1 = new Cheater();
        Player player2 = new CoolPlayer();
        new Game(player1, player2, 5);
        Assert.assertTrue(player1.getScore()>player2.getScore());
        Assert.assertEquals(15, player1.getScore(), 0.1);
        Assert.assertEquals(-5, player2.getScore(), 0.1);
    }

    @Test
    public void shouldReturnLowerScoreForCooperativePlayer() {
        Player player1 = new CoolPlayer();
        Player player2 = new Cheater();
        new Game(player1, player2, 5);
        Assert.assertTrue(player1.getScore()<player2.getScore());
        Assert.assertEquals(-5, player1.getScore(), 0.1);
        Assert.assertEquals(15, player2.getScore(), 0.1);
    }

    @Test
    public void shouldAcceptConsoleValue(){
        MockitoAnnotations.initMocks(this);
        Mockito.when(scannerWrapper.readInput()).thenReturn("CH");
        Player player1 = new ConsolePlayer(scannerWrapper);
        Player player2 = new CoolPlayer();
        new Game(player1, player2, 5);
        Assert.assertTrue(player1.getScore()>player2.getScore());
        Assert.assertEquals(15, player1.getScore(), 0.1);
        Assert.assertEquals(-5, player2.getScore(), 0.1);
    }
}
