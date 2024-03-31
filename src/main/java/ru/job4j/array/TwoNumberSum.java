package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        for (int i = 0, j = array.length - 1; i < j;) {
            if (array[i] + array[j] == target) {
                return new int[]{i, j};
            }
            if (array[i] + array[j] > target) {
                j--;
            }
            if (array[i] + array[j] < target) {
                i++;
            }
        }
        return new int[0];
    }
}