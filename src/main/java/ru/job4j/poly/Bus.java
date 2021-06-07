package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Еду домой");
    }

    @Override
    public void passengers(int number) {
        System.out.println("В поезде " + number);
    }

    @Override
    public double refuel(double fuelQuantity) {
        double cost = 1.53;
        return fuelQuantity * cost;
    }
}
