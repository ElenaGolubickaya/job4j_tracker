package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        return (first > second) ? first : second;
    }

    public static int max(int first, int second, int third) {
        int tmp1 = max(second, third);
        return max(first, tmp1);
    }

    public static int max(int first, int second, int third, int four) {
        int tmp1 = max(first, second);
        int tmp2 = max(third, four);
        return max(tmp1, tmp2);
    }

    public static void main(String[] args) {
        int rsl1 = Max.max(5, 8, 9);
        int rsl2 = Max.max(1, 7);
        int rsl3 = Max.max(15, 15, 52, 78);
        System.out.println(rsl1);
        System.out.println(rsl2);
        System.out.println(rsl3);
    }
}
