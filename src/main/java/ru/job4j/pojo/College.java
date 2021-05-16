package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan");
        student.setSurname("Ivanov");
        student.setGroup(2);
        student.setReceiptDate("12.06.2012");
        System.out.println(
                "Студент " + student.getName() + " " + student.getSurname() + "\n" +
                "группа " + student.getGroup() + "\n" +
                "дата поступления " + student.getReceiptDate()
        );
    }
}
