package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanReadableDurationFormatTest {
    @Test
    public void testFormatDuration_1second() {
        assertEquals("1 second", TimeFormatter.formatDuration(1));
    }

    @Test
    public void testFormatDuration_1minutes_2seconds() {
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
    }

    @Test
    public void testFormatDuration_2minutes() {
        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
    }
}
