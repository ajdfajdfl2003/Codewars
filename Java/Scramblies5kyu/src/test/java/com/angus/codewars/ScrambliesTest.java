package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScrambliesTest {
    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void testCase_cedewaraaossoqqyt() {
        testing(Scramblies.scramble("cedewaraaossoqqyt","codewars"),true);
    }

    @Test
    public void testCase_rkqodlw() {
        testing(Scramblies.scramble("rkqodlw", "world"), true);
    }
}
