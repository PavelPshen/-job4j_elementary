package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private  int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(1, 1);
        Point d = new Point(5, 5);
        Point e = new Point(2, 4);
        Point f = new Point(6, 12);
        Point g = new Point(4, 2);
        double distance = a.distance(b);
        System.out.println(distance);
        System.out.println(c.distance(d));
        System.out.println(e.distance(f));
        System.out.println(g.distance(f));
    }
}