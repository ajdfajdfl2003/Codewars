package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncodeResistorColorsTest {
    @Test
    public void test_47ohms() {
        assertEquals("yellow violet black gold", EncodeResistorColors.encodeResistorColors("47 ohms"));
    }

    @Test
    public void test_10ohms() {
        assertEquals("brown black black gold", EncodeResistorColors.encodeResistorColors("10 ohms"));
    }
}
