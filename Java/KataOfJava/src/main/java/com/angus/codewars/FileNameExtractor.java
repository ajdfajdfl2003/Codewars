package com.angus.codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 題目：https://www.codewars.com/kata/597770e98b4b340e5b000071
 */
public class FileNameExtractor {
    public static String extractFileName(String dirtyFileName) {
        String regexPattern = "^(\\d*)[_]([^ \\f\\n\\r\\t\\v]*)[.]([^ \\f\\n\\r\\t\\v]*)[.]";
        Pattern registrarPattern = Pattern.compile(regexPattern);
        Matcher matcher = registrarPattern.matcher(dirtyFileName);

        if (matcher.find()) {
            return matcher.group(2) + "." + matcher.group(3);
        }
        return "";
    }
}
