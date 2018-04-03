package com.angus.codewars;

/*
 題目：https://www.codewars.com/kata/563b662a59afc2b5120000c6
 */
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
