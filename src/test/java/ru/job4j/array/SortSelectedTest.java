package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortSame() {
        int[] data = new int[] {3, 4, 5, 1, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 1, 2, 3, 4, 5, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5Numbers() {
        int[] data = new int[] {9, 8, 7, 6, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 6, 7, 8, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Numbers() {
        int[] data = new int[] {10, -10, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-10, 0, 10};
        assertThat(result).containsExactly(expected);
    }
}