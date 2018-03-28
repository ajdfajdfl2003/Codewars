package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncodeResistorColorsTest {
    @Test
    public void test_470ohms() {
        assertEquals("yellow violet brown gold", EncodeResistorColors.encodeResistorColors("470 ohms"));
    }

    @Test
    public void test_330ohms() {
        assertEquals("orange orange brown gold", EncodeResistorColors.encodeResistorColors("330 ohms"));
    }

    @Test
    public void test_220ohms() {
        assertEquals("red red brown gold", EncodeResistorColors.encodeResistorColors("220 ohms"));
    }

    @Test
    public void test_100ohms() {
        assertEquals("brown black brown gold", EncodeResistorColors.encodeResistorColors("100 ohms"));
    }

    @Test
    public void test_47ohms() {
        assertEquals("yellow violet black gold", EncodeResistorColors.encodeResistorColors("47 ohms"));
    }

    @Test
    public void test_10ohms() {
        assertEquals("brown black black gold", EncodeResistorColors.encodeResistorColors("10 ohms"));
    }
}
