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

    @Test
    public void testFormatDuration_1hour() {
        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
    }

    @Test
    public void testFormatDuration_1hour_1minute_2seconds() {
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
    }

    @Test
    public void testFormatDuration_1hour_2seconds() {
        assertEquals("1 hour and 2 seconds", TimeFormatter.formatDuration(3602));
    }

    @Test
    public void testFormatDuration_now() {
        assertEquals("now", TimeFormatter.formatDuration(0));
    }

    @Test
    public void testFormatDuration_1day() {
        assertEquals("1 day", TimeFormatter.formatDuration(86400));
    }
}
