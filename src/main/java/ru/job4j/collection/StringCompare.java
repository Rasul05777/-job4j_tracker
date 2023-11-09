package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        for (int i = 0; i < left.length() - 1; i++) {
            char chL = left.charAt(i);
            char chR = right.charAt(i);
            int charComparison = Character.compare(chL, chR);
            if (charComparison != 0) {
                return charComparison;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}