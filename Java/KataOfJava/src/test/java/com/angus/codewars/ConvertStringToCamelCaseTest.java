package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertStringToCamelCaseTest {
    @Test
    public void testSomeUnderscoreUpperStart() {
        String input = "The_Stealth_Warrior";
        assertEquals("TheStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
    }

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: " + input);
        assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
    }
}
