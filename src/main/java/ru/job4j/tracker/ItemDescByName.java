package ru.job4j.tracker;

import java.util.Comparator;

public class ItemDescByName implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        if (o1.getName() == null) {
            return -1;
        } else if (o2.getName() == null) {
            return 1;
        } else {
            return 0;
        }
    }
}
