package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScrambliesTest {
    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void testCase_scriptsjava() {
        testing(Scramblies.scramble("scriptsjava", "javascripts"), true);
    }

    @Test
    public void testCase_scriptingjava() {
        testing(Scramblies.scramble("scriptingjava", "javascript"), true);
    }

    @Test
    public void testCase_scriptjavx() {
        testing(Scramblies.scramble("scriptjavx", "javascript"), false);
    }

    @Test
    public void testCase_katas() {
        testing(Scramblies.scramble("katas", "steak"), false);
    }

    @Test
    public void testCase_cedewaraaossoqqyt() {
        testing(Scramblies.scramble("cedewaraaossoqqyt", "codewars"), true);
    }

    @Test
    public void testCase_rkqodlw() {
        testing(Scramblies.scramble("rkqodlw", "world"), true);
    }
}
