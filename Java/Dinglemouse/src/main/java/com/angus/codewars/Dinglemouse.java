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
                    break;
                case 2:
                    int remain = humanYears - 2;
                    if (remain >= 0) {
                        cat += remain * 4;
                        dog += remain * 5;
                    }
                    break;
            }
        }
        return new int[]{humanYears, cat, dog};
    }
}
