package com.angus.codewars;

public class BuyCar {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int month = 0;
        int resetOfMoney;
        int totalAmount = 0;

        if (startPriceOld > startPriceNew) {
            resetOfMoney = startPriceOld - startPriceNew;
        } else {
            double ratio = 1 - (percentLossByMonth / 100);
            do {
                month++;
                totalAmount += savingperMonth;

                double lossTwiceMonth = month % 2 == 0 ? 0.005 : 0;
                ratio -= lossTwiceMonth;
                startPriceOld *= ratio;
                startPriceNew *= ratio;

                resetOfMoney = startPriceOld - startPriceNew + totalAmount;
            } while (resetOfMoney <= 0);
        }

        return new int[]{month, resetOfMoney};
    }
}
