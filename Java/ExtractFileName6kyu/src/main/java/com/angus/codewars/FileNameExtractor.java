package com.angus.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameExtractor {
    public static String extractFileName(String dirtyFileName) {
        String regexPattern = "^(\\d*)[_](\\w*.[^ \\f\\n\\r\\t\\v.]*)";
        List<String> result = new ArrayList<String>();
        Pattern registrarPattern = Pattern.compile(regexPattern);
        Matcher matcher = registrarPattern.matcher(dirtyFileName);

        while (matcher.find()) {
            result.add(matcher.group(2));
        }

        return result.get(0);
    }
}
