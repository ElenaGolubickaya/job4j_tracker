package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenTwoNumbersThenMax9() {
        Max numbers = new Max();
        int rsl1 = Max.max(8, 9);
        int expected = 9;
        assertEquals(expected, rsl1);
    }

    @Test
    public void whenThirdNumbersThenMax89() {
        Max numbers = new Max();
        int rsl2 = Max.max(8, 9, 89);
        int expected = 89;
        assertEquals(expected, rsl2);
    }

    @Test
    public void whenFourNumbersThenMax85() {
        Max numbers = new Max();
        int rsl3 = Max.max(85, 9, 55, 0);
        int expected = 85;
        assertEquals(expected, rsl3);
    }
}