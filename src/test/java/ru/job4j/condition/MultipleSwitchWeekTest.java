package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MultipleSwitchWeekTest {
    @Test
    void whenMondayThen1() {
        String name = "Monday";
        int expected = 1;
        double output = MultipleSwitchWeek.numberOfDay(name);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenMondaThenMinus1() {
        String name = "Monda";
        int expected = -1;
        double output = MultipleSwitchWeek.numberOfDay(name);
        assertThat(output).isEqualTo(expected);
    }
}