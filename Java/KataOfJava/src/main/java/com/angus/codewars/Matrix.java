package com.angus.codewars;

/*
 題目：https://www.codewars.com/kata/5595c56aa6ca910f27000155
 其中一種解法: http://fahdshariff.blogspot.tw/2010/12/throw-checked-exception-from-method.html
 */

public class Matrix {
    public static <T extends Exception> void enter() throws T {
        throw (T) new Neo();
    }
}
