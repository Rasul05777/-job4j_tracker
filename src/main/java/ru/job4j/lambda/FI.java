package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23),
        };
        Comparator<Attachment> comparator = (left, right) -> Integer.compare(left.getSize(), right.getSize());
        Arrays.sort(atts, comparator);
        Comparator<Attachment> comparatorString = (left, right) -> left.getName().compareTo(right.getName());
        Arrays.sort(atts, comparatorString);
        Comparator<Attachment> comparatorDescString = (left, right) -> right.getName().compareTo(left.getName());
        Arrays.sort(atts, comparatorDescString);
    }
}
