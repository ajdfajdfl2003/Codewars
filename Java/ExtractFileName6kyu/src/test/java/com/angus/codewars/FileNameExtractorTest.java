package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileNameExtractorTest {
    @Test
    public void testSample06() {
        assertEquals("FILE_NAM-E[.EXTENSION]"
                , FileNameExtractor.extractFileName("123123_FILE_NAM-E[.EXTENSION].OTHEREXTENSIONadasdassdassds34"));
    }

    @Test
    public void testSample05() {
        assertEquals("rr999cc3j9e11ptj0.ik[2]"
                , FileNameExtractor.extractFileName("1231231223123131_rr999cc3j9e11ptj0.ik[2].OTHEREXTENSIONadasdassdassds34"));
    }

    @Test
    public void testSample04() {
        assertEquals("myFile.tar"
                , FileNameExtractor.extractFileName("1231231223123131_myFile.tar.gz2"));
    }

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
