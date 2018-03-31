package com.angus.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MumblingAccumulTest {
    @Test
    public void testAccumu_MjtkuBovqrU() {
        assertEquals("M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu",
                Accumul.accum("MjtkuBovqrU"));
    }

    @Test
    public void tesAccumu_NyffsGeyylB() {
        assertEquals("N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb",
                Accumul.accum("NyffsGeyylB"));
    }

    @Test
    public void testAccumu_ZpglnRxqenU() {
        assertEquals("Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu",
                Accumul.accum("ZpglnRxqenU"));
    }
}
