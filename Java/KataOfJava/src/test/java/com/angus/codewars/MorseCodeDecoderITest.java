package com.angus.codewars;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MorseCodeDecoderITest {
    @Test
    public void test67890() {
        assertThat(MorseCodeDecoder.decode("----- ----. ---.. --... -...."),
                is("09876"));
    }

    @Test
    public void test12345() {
        assertThat(MorseCodeDecoder.decode(".---- ..--- ...-- ....- ....."),
                is("12345"));
    }

    @Test
    public void testOPQRSTVWXZ() {
        assertThat(MorseCodeDecoder.decode("--- .--. --.- .-. ... - ...- .-- -..- --.."),
                is("OPQRSTVWXZ"));
    }

    @Test
    public void testFGIKLMN() {
        assertThat(MorseCodeDecoder.decode("..-. --.   .. -.-   .-.. -- -."),
                is("FG IK LMN"));
    }

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
