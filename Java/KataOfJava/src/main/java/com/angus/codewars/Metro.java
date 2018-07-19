package com.angus.codewars;

import java.util.ArrayList;

/*
 題目：https://www.codewars.com/kata/number-of-people-in-the-bus
 */
public class Metro {
    public int countPassengers(ArrayList<int[]> stops) {
        return stops.stream().mapToInt(stop -> stop[0] - stop[1]).sum();
    }
}
