package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanReadableTimeTest {
    @Test
    public void testCase04() {
        assertEquals("makeReadable(86399)", "23:59:59", HumanReadableTime.makeReadable(86399));
    }

    @Test
    public void testCase03() {
        assertEquals("makeReadable(60)", "00:01:00", HumanReadableTime.makeReadable(60));
    }

    @Test
    public void testCase02() {
        assertEquals("makeReadable(5)", "00:00:05", HumanReadableTime.makeReadable(5));
    }

    @Test
    public void testCase01() {
        assertEquals("makeReadable(0)", "00:00:00", HumanReadableTime.makeReadable(0));
    }
}
