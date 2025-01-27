package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class TriangleTest {
    @Test
    public void area() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void area1() {
        Point x = new Point(0, 0, 0);
        Point y = new Point(4, 0, 0);
        Point z = new Point(0, 4, 0);
        Triangle triangle = new Triangle(x, y, z);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }
}