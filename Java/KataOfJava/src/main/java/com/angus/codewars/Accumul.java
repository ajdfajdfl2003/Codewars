package com.angus.codewars;

/*
 題目：https://www.codewars.com/kata/5667e8f4e3f572a8f2000039

 */
public class Accumul {
    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        String[] splitOfStr = s.split("");
        for (int i = 0; i < s.length(); i++) {
            result.append(splitOfStr[i].toUpperCase());
            result.append(getRepeatString(splitOfStr[i], i));
            if (i < s.length() - 1) {
                result.append("-");
            }
        }
        return result.toString();
    }

    /*
     用 repeat 次數來擴充陣列
     人後把 空陣列 取代成 重複的字元
     */
    private static String getRepeatString(String waitToRepeat, int repeatTimes) {
        return new String(new char[repeatTimes])
                .replace("\0", waitToRepeat.toLowerCase());
    }
}
