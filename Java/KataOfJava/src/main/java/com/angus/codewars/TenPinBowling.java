package com.angus.codewars;

import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class TenPinBowling {
    public static int bowling_score(String frames) {
        int lastScore = 0;
        Queue<Integer> waitForCalculate = new LinkedBlockingQueue<>();

        String[] eachFrame = frames.split(" ");
        for (String score : eachFrame) {
            if (score.contains("X")) {
                waitForCalculate.add(10);
                System.out.println(score);
                if (waitForCalculate.size() == 3) {
                    lastScore += waitForCalculate.stream().mapToInt(i -> i).sum();
                    waitForCalculate.remove();
                }
                if (score.length() == 3) {
                    lastScore += 60;
                }
            } else {
                lastScore += Arrays.stream(score.split("")).mapToInt(Integer::parseInt).sum();
            }
        }
        return lastScore;
    }
}
