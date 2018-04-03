package com.angus.codewars;

/*
 題目：https://www.codewars.com/kata/52e88b39ffb6ac53a400022e
 */
public class LongToIP {
    public static String longToIP(long ip) {
        // 用 Bitwise 的方法解
        long ip4 = ip & 0xFF;
        long ip3 = (ip >> 8) & 0xFF;
        long ip2 = (ip >> 16) & 0xFF;
        long ip1 = (ip >> 24) & 0xFF;
        return String.format("%d.%d.%d.%d", ip1, ip2, ip3, ip4);
    }
}
