package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class SortByName {
    @Test
    public void sortAscByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "заявка1"),
                new Item(2, "заявка9"),
                new Item(3, "заявка3"));
        List<Item> expected = Arrays.asList(
                new Item(1, "заявка1"),
                new Item(3, "заявка3"),
                new Item(2, "заявка9"));
        Collections.sort(items, new ItemAscByName());
        assertEquals(items, expected);
    }

    @Test
    public void sortDescByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "заявка1"),
                new Item(2, "заявка9"),
                new Item(3, "заявка3"));
        List<Item> expected = Arrays.asList(
                new Item(2, "заявка9"),
                new Item(3, "заявка3"),
                new Item(1, "заявка1"));
        Collections.sort(items, new ItemDescByName());
        assertEquals(items, expected);
    }
}
