package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextBiggerTest {
    @Test
    public void basicTests() {
        assertEquals(21, NextBigger.nextBiggerNumber(12));
        assertEquals(531, NextBigger.nextBiggerNumber(513));
        assertEquals(2071, NextBigger.nextBiggerNumber(2017));
        assertEquals(441, NextBigger.nextBiggerNumber(414));
        assertEquals(414, NextBigger.nextBiggerNumber(144));
    }
}
