package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To5Then6() {
        int left = 6;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To3Then4() {
        int left = 4;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To7Then7() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To9To10Then10() {
        int left = 7;
        int right = 9;
        int middle = 10;
        int result = Max.max(left, right, middle);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To2To15To1Then15() {
        int left = 7;
        int right = 2;
        int up = 15;
        int down = 1;
        int result = Max.max(left, right, up, down);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }
}