package com.angus.codewars;

public class BuyCar {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int month = 0;
        int resetOfMoney = 0;
        if (startPriceOld > startPriceNew) {
            resetOfMoney = startPriceOld - startPriceNew;
        }
        return new int[]{month, resetOfMoney};
    }
}
