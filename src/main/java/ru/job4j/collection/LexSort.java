package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] taskL = left.split("\\.");
        String[] taskR = right.split("\\.");
            int aLeft = Integer.parseInt(taskL[0]);
            int bRight = Integer.parseInt(taskR[0]);
            return Integer.compare(aLeft, bRight);
    }
}
