package ru.job4j.tracker;


import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll(Item[] item) {
        int count = 0;
        Item[] itemAll = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            Item item1 = items[i];
            if (item1 != null) {
                itemAll[count] = item1;
                count++;
            }
        }
        return Arrays.copyOf(itemAll, count);

    }

    public Item[] findByName(String key) {
        int count = 0;
        Item[] names = new Item[items.length];
        for (int i = 0; i < names.length; i++) {
            Item item = names[i];
            if (item.getName().equals(key)) {
                names[count] = item;
                count++;
            }
        }
        return Arrays.copyOf(names, size);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    @Override
    public String toString() {
        return "Tracker{"
                + "items=" + Arrays.toString(items)
                + ", ids=" + ids
                + ", size=" + size
                + '}';
    }
}