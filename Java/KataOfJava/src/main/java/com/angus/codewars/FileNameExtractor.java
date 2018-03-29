package com.angus.codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
