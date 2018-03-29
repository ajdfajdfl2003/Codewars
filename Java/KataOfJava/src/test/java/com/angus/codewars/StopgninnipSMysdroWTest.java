package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StopgninnipSMysdroWTest {
    @Test
    public void testWelcome() {
        assertEquals("emocleW", new StopgninnipSMysdroW().spinWords("Welcome"));
    }

    @Test
    public void testHey_wollef_sroirraw() {
        assertEquals("Hey wollef sroirraw", new StopgninnipSMysdroW().spinWords("Hey fellow warriors"));
    }

    @Test
    public void testThis_is_a_test() {
        assertEquals("This is a test", new StopgninnipSMysdroW().spinWords("This is a test"));
    }

    @Test
    public void testThis_is_another_test() {
        assertEquals("This is rehtona test", new StopgninnipSMysdroW().spinWords("This is another test"));
    }

    @Test
    public void testJust_gniddik_ereht_is_llits_one_more() {
        assertEquals("Just gniddik ereht is llits one more", new StopgninnipSMysdroW().spinWords("Just kidding there is still one more"));
    }
}
