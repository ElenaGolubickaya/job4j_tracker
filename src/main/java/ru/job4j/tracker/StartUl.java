package ru.job4j.tracker;

public class StartUl {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        Item item1 = tracker.add(new Item(1, "1 заявка"));
        Item item2 = tracker.add(new Item(2, "2 заявка"));
        Item item3 = tracker.add(new Item(3, "3 заявка"));
        Item[] items1 = {item1, item2, item3};
        for (Item all : items1) {
            System.out.println(all);
        }
        System.out.println();

        System.out.println(tracker.findById(1));

    }
}
