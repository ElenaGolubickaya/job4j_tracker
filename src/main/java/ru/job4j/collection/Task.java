package ru.job4j.collection;

public class Task {
    private String number;
    private String discription;

    public Task(String number, String discription) {
        this.number = number;
        this.discription = discription;
    }

    public String getNumber() {
        return number;
    }
}
