package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanReadableDurationFormatTest {
    @Test
    public void testFormatDuration_1second() {
        assertEquals("1 second", TimeFormatter.formatDuration(1));
    }
}
