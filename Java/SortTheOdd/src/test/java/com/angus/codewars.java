package com.angus;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class codewars {
    @Test
    public void exampleTest1() {
        int[] actual = Kata.newInstance().sortArray(new int[]{5, 3, 2, 8, 1, 4});
        assertThat(actual).isEqualTo(new int[]{1, 3, 2, 8, 5, 4});
    }

    @Test
    public void exampleTest2() {
        int[] actual = Kata.newInstance().sortArray(new int[]{5, 3, 1, 8, 0});
        assertThat(actual).isEqualTo(new int[]{1, 3, 5, 8, 0});
    }
}
