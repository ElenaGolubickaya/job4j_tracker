package ru.job4j.oop;

public class Battary {
    private int load;

    public Battary(int charge) {
        this.load = charge;
    }

    public void exchange(Battary another) {
        this.load = this.load + another.load;
    }

    public static void main(String[] args) {
        Battary lithium1 = new Battary(100);
        Battary lithium2 = new Battary(50);
        System.out.println("lithium1 : " + lithium1.load + ". lithium2 " + lithium2.load);
        lithium1.exchange(lithium2);
        System.out.println("lithium1 : " + lithium1.load + ". lithium2 " + lithium2.load);
    }
}
