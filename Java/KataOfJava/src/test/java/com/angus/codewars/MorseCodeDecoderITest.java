package com.angus.codewars;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MorseCodeDecoderITest {
    @Test
    public void testABC() {
        assertThat(MorseCodeDecoder.decode(".-   -...   -.-."),
                is("A B C"));
    }

    @Test
    public void testHEY_JUDE() {
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."),
                is("HEY JUDE"));
    }
}
