package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        Predicate<Student> classA = student -> student.getScore() >= 70 && student.getScore() <= 100;
        Predicate<Student> classB = student -> student.getScore() >= 50 && student.getScore() < 70;
        Predicate<Student> classC = student -> student.getScore() >= 0 && student.getScore() < 50;

        return students.stream()
                .filter(predicate).collect(Collectors.toList());
    }
}
