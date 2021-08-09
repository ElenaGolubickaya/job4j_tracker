package ru.job4j.ooa;

public class Airport {
    public static void main(String[] args) {
        final Airbus airbus1 = new Airbus("A320", 2);
        System.out.println(airbus1);
        airbus1.printCountEngine();
        final Airbus airbus2 = new Airbus("A380", 4);
        System.out.println(airbus2);
        airbus2.printCountEngine();
    }
}
