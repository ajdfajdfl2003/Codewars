package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrowthOfAPopulationTests {
    @Test
    public void test_pZero_1500_p_5000() {
        assertEquals(15, GrowthOfAPopulation.nbYear(1500, 5, 100, 5000));
    }
}
