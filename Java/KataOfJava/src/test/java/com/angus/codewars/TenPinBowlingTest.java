package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TenPinBowlingTest {
    @Test
    public void Sample03() {
        assertEquals(111,
                TenPinBowling.bowling_score("X 4/ 7/ 04 8/ 71 61 5/ 35 34"));
    }

    @Test
    public void Sample02() {
        assertEquals(115,
                TenPinBowling.bowling_score("00 5/ 4/ 53 33 22 4/ 5/ 45 XXX"));
    }

    @Test
    public void Strike_Spare_Game() {
        assertEquals(200,
                TenPinBowling.bowling_score("X 9/ X 7/ X 2/ X 5/ X 1/X"));
    }

    @Test
    public void Sample01() {
        assertEquals(171,
                TenPinBowling.bowling_score("X X 9/ 80 X X 90 8/ 7/ 44"));
    }

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
