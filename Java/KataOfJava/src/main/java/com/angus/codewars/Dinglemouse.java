package com.angus.codewars;

/*
 題目：https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b
 */
public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int cat = 0, dog = 0;
        switch (humanYears) {
            default:
            // 先扣掉前兩年的年齡
            // 並計算除了前兩年的年齡
                cat += (humanYears - 2) * 4;
                dog += (humanYears - 2) * 5;
            case 2:
            // 第二年
                cat += 9;
                dog += 9;
            case 1:
            // 第一年
                cat += 15;
                dog += 15;
        }
        return new int[]{humanYears, cat, dog};
    }
}
