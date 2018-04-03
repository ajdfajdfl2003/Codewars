package com.angus.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TenPinBowling {
    public static int bowling_score(String frames) {
        int lastScore = 0;
        String[] fArr = frames.split(" ");

        for (int i = 0; i < fArr.length; i++) {
            /*
            如果純數字，就不會進來
            如果符合 “Ｘ” 或是 0~9/ 那就進來取三位來算數
            */
            if (fArr[i].matches("X|[0-9]/")) {
                if (i < 9) fArr[i] = Arrays.stream(fArr, i, fArr.length)
                        .collect(Collectors.joining(""))
                        .substring(0, 3);
            }

            /*
            如果純數字，純計算
            如果符合 “0~9/” 取代成 X，在 map 的時候用 10 下去計算
            */
            lastScore += fArr[i].replaceAll("[0-9]/", "X")
                    .chars()
                    .map(n -> !Character.isDigit((char) n) ? 10 : Integer.valueOf(Character.toString((char) n)))
                    .sum();
        }

        return lastScore;
    }
}
