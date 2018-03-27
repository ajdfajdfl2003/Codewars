package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicEncryptTest {
    @Test
    public void testDecrypt01() throws Exception {
        BasicEncrypt enc = new BasicEncrypt();
        assertEquals("text = '', rule = 1", "",
                enc.encrypt("", 1));
    }
}
