package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DinglemouseTest {
    @Test
    public void testGiven_OneYearOld_Should_Get_1_15_15() {
        int[] actual = Dinglemouse.humanYearsCatYearsDogYears(1);

        int[] expected = new int[]{1, 15, 15};
        assertArrayEquals(expected, actual);
    }
}
