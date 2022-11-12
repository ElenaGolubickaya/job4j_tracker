package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public List<Student> collect(List<Student> pridict, Predicate<Student> students) {
        return pridict.stream().filter(students).collect(Collectors.toList());
    }
}
