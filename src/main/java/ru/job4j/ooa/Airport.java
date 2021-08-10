package ru.job4j.ooa;

public class Airport {
    public static void main(String[] args) {
        final Airbus airbus1 = new Airbus("A320");
        System.out.println(airbus1);
        airbus1.printCountEngine();
    }
}
