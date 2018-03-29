package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BuyCarTest {
    @Test
    public void test4() {
        int[] r = new int[]{1, 0};
        assertArrayEquals(r, BuyCar.nbMonths(7000, 8000, 985, 1.5));
    }

    @Test
    public void test3() {
        int[] r = new int[]{1, 15};
        assertArrayEquals(r, BuyCar.nbMonths(7000, 8000, 1000, 1.5));
    }

    @Test
    public void test1() {
        int[] r = new int[]{6, 766};
        assertArrayEquals(r, BuyCar.nbMonths(2000, 8000, 1000, 1.5));
    }

    @Test
    public void test2() {
        //old car price larger than new car
        int[] r = new int[]{0, 4000};
        assertArrayEquals(r, BuyCar.nbMonths(12000, 8000, 1000, 1.5));
    }
}
