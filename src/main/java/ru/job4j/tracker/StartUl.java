package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUl {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.println("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Добавленная заявка: " + item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Хранилище еще не содержит заявок");
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Заявка изменена успешно.");
                } else {
                    System.out.println("Ошибка замены заявки.");
                }
            } else if (select != 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + "." + menu[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUl().init(scanner, tracker);

        /* System.out.println("----------------------------------------");
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
        System.out.println();
        Item bug = new Item();
        System.out.println(bug);
        System.out.println("-------------------------------------------");

        */
    }
}
