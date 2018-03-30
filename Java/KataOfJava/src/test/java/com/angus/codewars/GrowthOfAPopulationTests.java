package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrowthOfAPopulationTests {
    @Test
    public void test_pZero_1500000_p_2000000_with_0point25() {
        assertEquals(94, GrowthOfAPopulation.nbYear(1500000, 0.25, 1000, 2000000));
    }

    @Test
    public void test_pZero_1500000_p_2000000() {
        assertEquals(10, GrowthOfAPopulation.nbYear(1500000, 2.5, 10000, 2000000));
    }

    @Test
    public void test_pZero_1500_p_5000() {
        assertEquals(15, GrowthOfAPopulation.nbYear(1500, 5, 100, 5000));
    }
}
