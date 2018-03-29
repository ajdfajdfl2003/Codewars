package com.angus.codewars;

public class BuyCar {

    public static final double TWICE_MONTH_LOSS_RATIO = 0.005;

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int month = 0;
        int resetOfMoney;
        int totalAmount = 0;

        double ratio = 1 - (percentLossByMonth / 100);
        while (startPriceOld + totalAmount < startPriceNew) {
            month++;
            totalAmount += savingperMonth;

            double lossTwiceMonth = month % 2 == 0 ? TWICE_MONTH_LOSS_RATIO : 0;
            ratio -= lossTwiceMonth;
            startPriceOld *= ratio;
            startPriceNew *= ratio;
        }

        resetOfMoney = startPriceOld + totalAmount - startPriceNew;
        return new int[]{month, resetOfMoney};
    }
}
