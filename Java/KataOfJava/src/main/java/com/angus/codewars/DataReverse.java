package com.angus.codewars;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DataReverse {
    public static int[] DataReverse(int[] data) {
        List<Integer> result = new LinkedList<>();
        for (int i = data.length / 8 - 1; i >= 0; i--) {
            result.addAll(Arrays.stream(data).skip(i * 8L).limit(8L).boxed().collect(Collectors.toList()));
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
