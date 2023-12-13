package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        Predicate<Person> name = value -> value.getName().contains(key);
        Predicate<Person> surname = value -> value.getSurname().contains(key);
        Predicate<Person> phone = value -> value.getPhone().contains(key);
        Predicate<Person> address = value -> value.getAddress().contains(key);
        Predicate<Person> combine = name.or(surname).or(phone).or(address);
        for (var p : persons) {
            if (combine.test(p)) {
                result.add(p);
            }
        }
        return result;
    }
}

