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
        List<Item> expected = new ArrayList<>(items);
        expected.sort(new ItemAscByName());
        items.sort(new ItemAscByName());
        assertEquals(expected, items);
    }

    @Test
    public void testSortDescByName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Rsl"));
        items.add(new Item("Senior"));
        items.add(new Item("Dev"));
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = new ArrayList<>(items);
        expected.sort(new ItemDescByName());
        items.sort(new ItemDescByName());
        assertEquals(expected, items);
    }
}