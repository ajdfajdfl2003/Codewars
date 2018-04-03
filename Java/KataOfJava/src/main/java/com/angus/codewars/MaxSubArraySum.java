package com.angus.codewars;

import java.util.Arrays;

/*
 題目：https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c
 參考演算法：http://www.csie.ntnu.edu.tw/~u91029/MaximumSubarray.html#4
 */
public class MaxSubArraySum {
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
