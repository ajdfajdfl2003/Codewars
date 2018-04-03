package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayingWithPassPhrasesTest {
    @Test
    public void test1() {
        assertEquals("!!!vPz fWpM J", PlayingWithPassPhrases.playPass("I LOVE YOU!!!", 1));
    }

    @Test
    public void test4() {
        assertEquals("4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO",
                PlayingWithPassPhrases.playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));
    }
}
