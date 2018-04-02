package com.angus.codewars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DirReductionTest {
    private DirReduction sut;

    @Before
    public void setUp() {
        this.sut = new DirReduction();
    }

    @Test
    public void testSimpleDirReduc02() {
        assertArrayEquals(new String[]{"NORTH", "WEST", "SOUTH", "EAST"},
                DirReduction.dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}));
    }

    @Test
    public void testSimpleDirReduc01() {
        assertArrayEquals(new String[]{"WEST"},
                this.sut.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
    }
}
