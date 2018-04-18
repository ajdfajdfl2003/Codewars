package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertStringToCamelCaseTest {
    @Test
    public void testSomeUnderscoreUpperStart() {
        String input = "The_Stealth_Warrior";
        assertEquals("TheStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
    }
}
