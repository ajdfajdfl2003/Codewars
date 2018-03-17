package com.angus.codewars;

public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int cat = humanYears * 15;
        int dog = humanYears * 15;
        return new int[]{humanYears, cat, dog};
    }
}
