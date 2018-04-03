package com.angus.codewars;

import java.util.Arrays;

public class TenPinBowling {
    public static int bowling_score(String frames) {
        int lastScore = 0;
        String[] eachFrame = frames.split(" ");
        for (String score : eachFrame) {
            lastScore += Arrays.stream(score.split("")).mapToInt(Integer::parseInt).sum();
        }
        return lastScore;
    }
}
