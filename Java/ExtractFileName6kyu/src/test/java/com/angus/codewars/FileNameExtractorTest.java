package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileNameExtractorTest {
    @Test
    public void testSample01() {
        assertEquals(
                "FILE_NAME.EXTENSION",
                FileNameExtractor.extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION")
        );
    }
}
