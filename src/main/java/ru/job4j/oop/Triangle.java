package ru.job4j.oop;

import static java.lang.StrictMath.sqrt;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }

    public boolean exist(double ab, double ac, double bc) {
        return ((ab + ac) > bc || (ac + bc) > ab || (ab + bc) > ac);

    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double p = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            double S = sqrt(p * (p - ab) * (p - ac) * (p - bc));
            rsl = S;
        }
        return rsl;
    }

    public static void main(String[] args) {
        Point a = new Point(5, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
    }
}
