package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortestWordTest {
    @Test
    public void GivenOneWord() {
        Kata target = new Kata();

        String givenWord = "Kata";
        int actual = target.findShort(givenWord);

        assertEquals(4, actual);
    }
}
