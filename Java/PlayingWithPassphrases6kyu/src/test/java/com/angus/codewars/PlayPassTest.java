package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayPassTest {
    @Test
    public void test1() {
        assertEquals("!!!vPz fWpM J", PlayPass.playPass("I LOVE YOU!!!", 1));
    }
}
