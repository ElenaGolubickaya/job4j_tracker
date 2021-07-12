package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                return i;
            }
        }
        throw new ElementNotFoundException("there is no such element in the array");
    }

    public static void main(String[] args) {
        String[] result = {"Elena", "Slava", "Ivan"};
        try {
            int rsl = FindEl.indexOf(result, "Slava");
            System.out.println(rsl);
            System.out.println("такой элемент есть в массиве");
        } catch (ElementNotFoundException e) {
            System.out.println("обработано исключение");
        }
    }
}
