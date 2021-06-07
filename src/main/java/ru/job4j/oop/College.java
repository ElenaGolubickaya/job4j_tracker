package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        Freshman freshman = new Freshman();

        Student1 students = freshman;
        Object obj = freshman;
    }
}
