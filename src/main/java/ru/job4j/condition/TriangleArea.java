package ru.job4j.condition;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double result1 = (a + b + c) / 2;
        double result2 = result1 - a;
        double result3 = result1 - b;
        double result4 = result1 - c;
        double result5 = result1 * result2 * result3 * result4;
        double result6 = Math.sqrt(result5);
        return result6;
    }

    public static void main(String[] args) {
        double result = TriangleArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}