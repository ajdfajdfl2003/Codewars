package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileNameExtractorTest {
    @Test
    public void testSample03() {
        assertEquals("This_is_an_otherExample.mpg"
                , FileNameExtractor.extractFileName("1_This_is_an_otherExample.mpg.OTHEREXTENSIONadasdassdassds34"));
    }

    @Test
    public void testSample02() {
        assertEquals(
                "FILE_NAME.EXTENSION",
                FileNameExtractor.extractFileName("1_FILE_NAME.EXTENSION.OTHEREXTENSIONadasdassdassds34")
        );
    }

    @Test
    public void testSample01() {
        assertEquals(
                "FILE_NAME.EXTENSION",
                FileNameExtractor.extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION")
        );
    }
}
