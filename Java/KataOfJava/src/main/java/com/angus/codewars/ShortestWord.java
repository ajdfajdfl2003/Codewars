package com.angus.codewars;

import java.util.stream.Stream;

/*
 題目：https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9
 */
public class ShortestWord {
    // 用 stream 吃 分割好後的字串陣列
    // 然後 取每個陣列內字串長度
    // 最後取最小值
    public static int findShort(String s) {
        return Stream.of(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }
}
