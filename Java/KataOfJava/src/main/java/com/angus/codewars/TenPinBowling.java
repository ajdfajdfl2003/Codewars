package com.angus.codewars;

public class TenPinBowling {
    public static int bowling_score(String frames) {
        int lastScore = 0, gameRoll = 0, index = 0;
        String[] eachFrame = frames.replace(" ", "").split("(?<!^)");

        do {
            if (eachFrame[index].equalsIgnoreCase("x")) {
                lastScore += 10
                        + checkScore(eachFrame[index + 1], eachFrame[index])
                        + checkScore(eachFrame[index + 2], eachFrame[index + 1]);
                gameRoll++;
            } else if (eachFrame[index].equals("/")) {
                lastScore += (10 - Integer.parseInt(eachFrame[index - 1]))
                        + checkScore(eachFrame[index + 1], "");
                if (index % 2 == 1) {
                    gameRoll++;
                }
            } else {
                lastScore += Integer.parseInt(eachFrame[index]);
                if (index % 2 == 1) {
                    gameRoll++;
                }
            }
            index++;
        } while (gameRoll < 10);

        return lastScore;
    }

    private static int checkScore(String score, String previousScore) {
        if (score.equalsIgnoreCase("x")) {
            return 10;
        } else if (score.equals("/")) {
            return 10 - Integer.parseInt(previousScore);
        }
        return Integer.parseInt(score);
    }
}
