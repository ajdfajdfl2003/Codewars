package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class longToIPTests {
    @Test
    public void sampleTest_0() {
        assertEquals("0.0.0.0", Kata.longToIP(0));
    }

    @Test
    public void sampleTest_2154959208L() {
        assertEquals("128.32.10.1", Kata.longToIP(2149583361L));
    }
}
