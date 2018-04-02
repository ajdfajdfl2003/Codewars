package com.angus.codewars;

import java.util.Arrays;

public class Max {
    public static int sequence(int[] arr) {
        if (Arrays.asList(arr).isEmpty()) {
            return 0;
        }

        int maxOfSum = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (sum > 0) {
                sum += arr[i];
            } else {
                sum = arr[i];
            }

            if (sum > maxOfSum) {
                maxOfSum = sum;
            }
        }
        return maxOfSum;
    }
}
