package com.angus.codewars;

public class BuyCar {

    public static final double TWICE_MONTH_LOSS_RATIO = 0.005;

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int month = 0;
        double resetOfMoney;
        double totalAmount = 0;
        double oldCarPrice = startPriceOld;
        double newCarPrice = startPriceNew;

        double ratio = 1 - (percentLossByMonth / 100);
        while (oldCarPrice + totalAmount < newCarPrice) {
            month++;
            totalAmount += savingperMonth;

            double lossTwiceMonth = month % 2 == 0 ? TWICE_MONTH_LOSS_RATIO : 0;
            ratio -= lossTwiceMonth;
            oldCarPrice *= ratio;
            newCarPrice *= ratio;
        }

        resetOfMoney = oldCarPrice - newCarPrice + totalAmount;
        return new int[]{month, (int) Math.round(resetOfMoney)};
    }
}
