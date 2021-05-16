package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book novels = new Book("Начни сначала ", 250);
        Book story = new Book("Морозко ", 12);
        Book horrors = new Book("Тьма ", 156);
        Book science = new Book("Clean code ", 100);
        Book[] books = new Book[4];
        books[0] = novels;
        books[1] = story;
        books[2] = horrors;
        books[3] = science;

        for (int index = 0; index < books.length; index++) {
            Book bk1 = books[index];
            System.out.println(bk1.getName() + bk1.getNumberOfPages());
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int index = 0; index < books.length; index++) {
            Book bk2 = books[index];
            if (bk2.equals(science)) {
                System.out.println(bk2.getName() + " - " + bk2.getNumberOfPages());
            }
        }
    }
}

