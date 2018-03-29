package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditcardValidationTest {
    @Test
    public void test4111111111111111() {
        assertEquals(true, CreditcardValidation.validate("4111111111111111"));
    }

    @Test
    public void test26() {
        assertEquals(true, CreditcardValidation.validate("26"));
    }

    @Test
    public void test2121() {
        assertEquals(true, CreditcardValidation.validate("2121"));
    }

    @Test
    public void test1230() {
        assertEquals(true, CreditcardValidation.validate("1230"));
    }

    @Test
    public void test891() {
        assertEquals(false, CreditcardValidation.validate("891"));
    }
}
