package com.angus.codewars;

public class Kata {

    private static final int BIT_MAX = 31;

    public static String longToIP(long ip) {
        StringBuilder binary = new StringBuilder();
        long tmp = ip;
        for (int i = BIT_MAX; i >= 0; i--) {
            long powValue = Math.round(Math.pow(2, i));
            if (Math.round(tmp / powValue) == 1) {
                binary.append(1);
                tmp = tmp - powValue;
            } else {
                binary.append(0);
            }
        }
        String result = "";
        for (int i = 0; i < 4; i++) {
            result += String.valueOf(Integer.parseInt(binary.substring(i * 8, (i + 1) * 8), 2)) + (i < 3 ? "." : "");
        }
        return result.toString();
    }
}
