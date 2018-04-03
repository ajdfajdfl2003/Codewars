package com.angus.codewars;

public class TenPinBowling {
    public static int bowling_score(String frames) {
        int lastScore = 0, gameRoll = 0, index = 0;
        String[] eachFrame = frames.replace(" ", "").split("(?<!^)");

        do {
            if (eachFrame[gameRoll].equalsIgnoreCase("x")) {
                lastScore += 10
                        + checkScore(eachFrame[gameRoll + 1])
                        + checkScore(eachFrame[gameRoll + 2]);
                gameRoll++;
            } else {
                lastScore += Integer.parseInt(eachFrame[gameRoll]);
                if (index % 2 == 1) {
                    gameRoll++;
                }
            }
            index++;
        } while (gameRoll < 10);

        return lastScore;
    }

    private static int checkScore(String score) {
        if (score.equalsIgnoreCase("x")) {
            return 10;
        }
        return 0;
    }
}
