package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TenPinBowlingTest {
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
