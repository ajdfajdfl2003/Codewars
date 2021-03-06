package com.angus.codewars;

/*
 題目：https://www.codewars.com/kata/55c04b4cc56a697bb0000048
 */
public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2)) {
            return true;
        }

        char[] str1ToChars = str1.toCharArray();
        char[] str1ContainStr2 = new char[str2.length()];
        StringBuilder newStr2 = new StringBuilder(str2);

        for (int i = 0; i < str1ToChars.length; i++) {

            int indexInStr2 = newStr2.indexOf(Character.toString(str1ToChars[i]));
            if (indexInStr2 != -1) {
                str1ContainStr2[indexInStr2] = str1ToChars[i];
                newStr2.setCharAt(indexInStr2, '\u0000');
            }
        }

        return str2.equalsIgnoreCase(new String(str1ContainStr2));
    }
}
