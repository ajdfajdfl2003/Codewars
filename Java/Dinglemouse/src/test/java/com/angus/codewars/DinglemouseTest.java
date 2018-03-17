package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DinglemouseTest {
    @Test
    public void testGiven_TwoYearOld_Should_Get_2_24_24() {
        int[] actual = Dinglemouse.humanYearsCatYearsDogYears(2);

        int[] expected = new int[]{2, 24, 24};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGiven_OneYearOld_Should_Get_1_15_15() {
        int[] actual = Dinglemouse.humanYearsCatYearsDogYears(1);

        int[] expected = new int[]{1, 15, 15};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGiven_ThreeYearOld_Should_Get_3_28_29() {
        int[] actual = Dinglemouse.humanYearsCatYearsDogYears(3);

        int[] expected = new int[]{3, 28, 29};
        assertArrayEquals(expected, actual);
    }
}
