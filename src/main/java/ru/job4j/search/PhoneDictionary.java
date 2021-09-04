package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person1 : persons) {
            if (person1.getName().contains(key)
                    || person1.getSurname().contains(key)
                    || person1.getPhone().contains(key)
                    || person1.getAddress().contains(key)) {
                result.add(person1);
            }
        }
        return result;
    }
}
