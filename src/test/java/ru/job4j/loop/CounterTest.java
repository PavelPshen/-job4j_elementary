package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart2Finish5ThenSum14() {
        int start = 2;
        int finish = 5;
        int expected = 14;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart0Finish3ThenSum6() {
        int start = 1;
        int finish = 3;
        int expected = 6;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart6Finish3ThenSum0() {
        int start = 6;
        int finish = 3;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}