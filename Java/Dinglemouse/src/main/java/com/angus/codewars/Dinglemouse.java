package com.angus.codewars;

public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int cat = 0, dog = 0;
        switch (humanYears) {
            default:
                cat += (humanYears - 2) * 4;
                dog += (humanYears - 2) * 5;
            case 2:
                cat += 9;
                dog += 9;
            case 1:
                cat += 15;
                dog += 15;
        }
        return new int[]{humanYears, cat, dog};
    }
}
