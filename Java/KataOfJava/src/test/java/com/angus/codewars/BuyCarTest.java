package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BuyCarTest {
    @Test
    public void test2() {
        //old car price larger than new car
        int[] r = new int[] { 0, 4000 };
        assertArrayEquals(r, BuyCar.nbMonths(12000, 8000, 1000, 1.5));
    }
}
