package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus1Minus1to11then2dot82() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, 1);
        double expected = 2.82;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus22to22then4() {
        Point a = new Point(-2, 2);
        Point b = new Point(2, 2);
        double expected = 4;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when000to002then2() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 2);
        double expected = 2;
        double output = a.distance3D(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when111to222then2() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(2, 2, 2);
        double expected = 1.73;
        double output = a.distance3D(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}