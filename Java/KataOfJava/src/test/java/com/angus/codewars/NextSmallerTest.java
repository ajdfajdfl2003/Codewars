package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextSmallerTest {
    @Test
    public void testCase1027_negative() {
        assertEquals(-1, NextSmaller.nextSmaller(1027));
    }

    @Test
    public void testCase441_414() {
        assertEquals(414, NextSmaller.nextSmaller(441));
    }

    @Test
    public void testCase_907_790() {
        assertEquals("NextSmaller.nextSmaller(907)"
                , 790, NextSmaller.nextSmaller(907));
    }

    @Test
    public void testCase_531_513() {
        assertEquals(513, NextSmaller.nextSmaller(531));
    }

    @Test
    public void testCase_21_12() {
        assertEquals(12, NextSmaller.nextSmaller(21));
    }
}
