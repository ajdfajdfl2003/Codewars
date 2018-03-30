package com.angus.codewars;

public class GrowthOfAPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int pn = p0;
        int count = 0;
        while (pn < p) {
            pn = pn + (int) (pn * (percent / 100)) + aug;
            count++;
        }
        return count;
    }
}
