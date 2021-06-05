package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUl {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("===Create a new Item ====");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                System.out.println(tracker.add(item));
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item[] itemAll = tracker.findAll();
                for (Item item1 : itemAll) {
                    System.out.println(item1);
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.println("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Операция успешно выполнена");
                } else {
                    System.out.println("Ошибка");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.println("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Операция успешно выполнена");
                } else {
                    System.out.println("Ошибка");
                }
            } else if (select == 4) {
                System.out.println("===  Find item by Id ===");
                System.out.println("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                Item item2 = tracker.findById(id);
                if (item2 != null) {
                    System.out.println(item2);
                } else {
                    System.out.println("Заявка с таким id не найдена");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item[] item1 = tracker.findByName(name);
                if (item1.length > 0) {
                    for (Item item : item1) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Заявки с таким именем не найдены");
                }
            } else if (select == 6) {
                System.out.println("=== Exit Program ===");
                run = false;
            } else {
                System.out.println();
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
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
