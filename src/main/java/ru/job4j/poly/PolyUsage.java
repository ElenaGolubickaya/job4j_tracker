package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus1 = new Bus1();
        Vehicle[] vehicles = new Vehicle[]{plane, train, bus1};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
