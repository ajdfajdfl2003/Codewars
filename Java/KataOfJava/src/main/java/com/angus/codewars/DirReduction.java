package com.angus.codewars;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 題目：https://www.codewars.com/kata/550f22f4d758534c1100025a
 */
public class DirReduction {
    private static Map<String, String> opposite = new HashMap<>();

    /*
     先把相反方向定義出來
     */
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
                // 如果現在這個跟暫存在 result 內有相反方向
                // 就把暫存 pop 出去
                result.pop();
            } else {
                result.push(arr[i]);
            }
        }
        return result.toArray(new String[0]);
    }
}
