package com.angus.codewars;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DirReduction {
    private static Map<String, String> opposite = new HashMap<>();

    static {
        opposite.put("north", "south");
        opposite.put("south", "north");
        opposite.put("east", "west");
        opposite.put("west", "east");
    }

    public static String[] dirReduc(String[] arr) {
        Stack<String> result = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (!result.isEmpty() &&
                    result.peek().equalsIgnoreCase(opposite.get(arr[i].toLowerCase()))) {
                result.pop();
            } else {
                result.push(arr[i]);
            }
        }
        return result.toArray(new String[0]);
    }
}
