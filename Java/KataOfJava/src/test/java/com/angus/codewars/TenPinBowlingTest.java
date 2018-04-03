package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TenPinBowlingTest {
    @Test
    public void CleanGame() {
        assertEquals(178,
                TenPinBowling.bowling_score("5/ 8/ 6/ 7/ 7/ 9/ 5/ 8/ 9/ 9/X"));
    }

    @Test
    public void PerfectGame() {
        assertEquals(300,
                TenPinBowling.bowling_score("X X X X X X X X X XXX"));
    }

    @Test
    public void BasicTests() {
        assertEquals(20,
                TenPinBowling.bowling_score("11 11 11 11 11 11 11 11 11 11"));
    }
}
