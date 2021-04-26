package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String row = "Неизвестное слово " + eng;
        return row;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String say = word.engToRus("Hi");
        System.out.println(say);
    }
}
