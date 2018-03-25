package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditcardValidationTest {
    @Test
    public void test2121() {
        assertEquals(true, Validate.validate("2121"));
    }

    @Test
    public void test1230() {
        assertEquals(true, Validate.validate("1230"));
    }

    @Test
    public void test891() {
        assertEquals(false, Validate.validate("891"));
    }
}
