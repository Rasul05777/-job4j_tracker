package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        String[] strings = {"A", "AB", "ABC", "ABCD", "ABCDE"};
        Comparator<String> comparatorName = (left, right) -> Integer.compare(left.length(), right.length());
        Arrays.sort(strings, comparatorName);
        for (String string : strings) {
            System.out.println(string);
        }
        Comparator<String> comparatorDescName = (left, right) -> Integer.compare(right.length(), left.length());
        Arrays.sort(strings, comparatorDescName);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
