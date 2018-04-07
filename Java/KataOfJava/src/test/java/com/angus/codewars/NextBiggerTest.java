package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextBiggerTest {
    @Test
    public void test2024249490() {
        assertEquals(2024249904, NextBigger.nextBiggerNumber(2024249490));
    }

    @Test
    public void basicNegativeTest() {
        assertEquals(-1, NextBigger.nextBiggerNumber(9));
        assertEquals(-1, NextBigger.nextBiggerNumber(111));
        assertEquals(-1, NextBigger.nextBiggerNumber(531));
    }

    @Test
    public void basicTests() {
        assertEquals(21, NextBigger.nextBiggerNumber(12));
        assertEquals(531, NextBigger.nextBiggerNumber(513));
        assertEquals(2071, NextBigger.nextBiggerNumber(2017));
        assertEquals(441, NextBigger.nextBiggerNumber(414));
        assertEquals(414, NextBigger.nextBiggerNumber(144));
    }
}
