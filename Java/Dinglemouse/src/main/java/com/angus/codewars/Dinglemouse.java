package com.angus.codewars;

public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int cat = 0, dog = 0;
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    if (humanYears - 1 >= 0) {
                        cat = dog = 15;
                    }
                    break;
                case 1:
                    if (humanYears - 2 >= 0) {
                        cat = dog += 9;
                    }
            }
        }
        return new int[]{humanYears, cat, dog};
    }
}
