package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int middle) {
        return max(max(left, right), middle);
    }

    public static int max(int left, int right, int up, int down) {
        System.out.println(up);
        return max((max(left, right, up)), down);
    }
}