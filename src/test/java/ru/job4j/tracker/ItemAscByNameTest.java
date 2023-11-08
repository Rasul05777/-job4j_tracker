package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ItemAscByNameTest {

    @Test
    public void testSortAscByName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Rsl"));
        items.add(new Item("Senior"));
        items.add(new Item("Dev"));
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = new ArrayList<>();
        expected.add(new Item("Dev"));
        expected.add(new Item("Rsl"));
        expected.add(new Item("Senior"));
    }

    @Test
    public void testSortDescByName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Rsl"));
        items.add(new Item("Senior"));
        items.add(new Item("Dev"));
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = new ArrayList<>();
        expected.add(new Item("Senior"));
        expected.add(new Item("Rsl"));
        expected.add(new Item("Dev"));
    }
}