package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class StartUl {
    public static void main(String[] args) {
        Item one = new Item();
        one.getCreated();
        System.out.println(("Текущие дата и время: " + one.getCreated()));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String oneDateTimeFormat = one.getCreated().format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + oneDateTimeFormat);
    }
}
