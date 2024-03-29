package ru.job4j.array;

public class EqualLast {
    @SuppressWarnings("checkstyle:RightCurly")
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }
}