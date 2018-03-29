package com.angus.codewars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortestWordTest {
    private ShortestWord target;

    @Before
    public void setUp() {
        this.target = new ShortestWord();
    }

    @Test
    public void GivenOneWord() {
        String givenWord = "Kata";
        int actual = target.findShort(givenWord);

        assertEquals(4, actual);
    }

    @Test
    public void GivenTwoWord_Should_Return4() {
        String givenWord = "bitcoin take";
        int actual = target.findShort(givenWord);

        assertEquals(4, actual);
    }

    @Test
    public void GivenTestCase_One_Should_Return3() {
        String givenWord = "bitcoin take over the world maybe who knows perhaps";
        int actual = target.findShort(givenWord);

        assertEquals(3, actual);
    }

    @Test
    public void GivenTestCase_Two_Should_Return3() {
        ShortestWord target = new ShortestWord();

        String givenWord = "turns out random test cases are easier than writing out basic ones";
        int actual = target.findShort(givenWord);

        assertEquals(3, actual);
    }
}
