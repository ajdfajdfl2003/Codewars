package com.angus.codewars;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
 題目：https://www.codewars.com/kata/the-learning-game-machine-learning-number-1
 */
public class MachineLearning {
    static class Actions {
        static final List<Function<Integer, Integer>> FUNCTIONS = Arrays.asList(x -> x + 1, x -> 0, x -> x % 2, x -> x / 2, x -> x * 100);
    }

    public int command(int cmd, int num) {
        int result = 0;
        if (cmd == 0) {
            return Actions.FUNCTIONS.get(1).apply(num);
        }
        return result;
    }

    public void response(boolean result) {

    }
}
