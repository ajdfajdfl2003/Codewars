package com.angus.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/*
 題目：https://www.codewars.com/kata/the-learning-game-machine-learning-number-1
 */
public class MachineLearning {
    private final int INIT_ACTION_INDEX = 0;

    private int recordNumber;
    private int recordCommand;
    private Map<Integer, Integer> recordData = new HashMap<>();

    static class Actions {
        static final List<Function<Integer, Integer>> FUNCTIONS = Arrays.asList(x -> x + 1, x -> 0, x -> x % 2, x -> x / 2, x -> x * 100);
    }

    public int command(int cmd, int num) {
        this.recordCommand = cmd;
        this.recordNumber = num;
        if (!recordData.containsKey(this.recordCommand)) {
            recordData.put(this.recordCommand, INIT_ACTION_INDEX);
        }
        int current = recordData.get(this.recordCommand);
        return Actions.FUNCTIONS.get(current).apply(this.recordNumber);
    }

    public void response(boolean result) {
        if (!result) {
            int newAction = recordData.get(this.recordCommand) + 1;
            recordData.put(this.recordCommand, newAction);
        }
    }
}
