package com.angus.codewars;

public class LongToIP {

    private static final int BIT_MAX = 31;

    public static String longToIP(long ip) {
        long ip4 = ip & 0xFF;
        long ip3 = (ip >> 8) & 0xFF;
        long ip2 = (ip >> 16) & 0xFF;
        long ip1 = (ip >> 24) & 0xFF;
        return String.format("%d.%d.%d.%d", ip1, ip2, ip3, ip4);
    }
}
