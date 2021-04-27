package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void errorOutput() {
        System.out.println("Наличие ошибки " + " " + active);
        System.out.println("Статус ошибки " + " " + status);
        System.out.println("Сообщение об ошибки" + " " + message);
    }

    public static void main(String[] args) {
        Error incorrectDate = new Error();
        Error systemСrash1 = new Error(true, 105, "Ошибка доступа.");
        Error systemСrash2 = new Error(false, 102, "Недостаточно памяти.");
        incorrectDate.errorOutput();
        systemСrash1.errorOutput();
        systemСrash2.errorOutput();
    }
}
