package com.angus.codewars;

import java.util.ArrayList;
import java.util.Arrays;

/*
 題目：https://www.codewars.com/kata/number-of-people-in-the-bus
 */
public class Metro {
    public int countPassengers(ArrayList<int[]> stops) {
        int result = 0;

        for (int[] stop : stops) {
            result += Arrays.stream(stop).reduce((left, right) ->
                    left - right
            ).getAsInt();
        }

        return result;
    }
}
