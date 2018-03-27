package com.angus.codewars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicEncryptTest {
    private BasicEncrypt enc;

    @Before
    public void setUp() throws Exception {
        this.enc = new BasicEncrypt();
    }

    @Test
    public void testDecrypt02() {
        assertEquals("text = 'a', rule = 1", "b",
                enc.encrypt("a", 1));
    }

    @Test
    public void testDecrypt01() throws Exception {
        assertEquals("text = '', rule = 1", "",
                enc.encrypt("", 1));
    }
}
