package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongToIPTests {
    @Test
    public void sampleTest_2154959208L() {
        assertEquals("128.114.17.104", LongToIP.longToIP(2154959208L));
    }

    @Test
    public void sampleTest_0() {
        assertEquals("0.0.0.0", LongToIP.longToIP(0));
    }

    @Test
    public void sampleTest_2149583361L() {
        assertEquals("128.32.10.1", LongToIP.longToIP(2149583361L));
    }
}
