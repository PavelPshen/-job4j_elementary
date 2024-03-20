package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double result1 = p / (2 * (k + 1));
        double result2 = result1 * k;
        double result3 = result1 * result2;
        return result3;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
        result = RectangleArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
    }
}