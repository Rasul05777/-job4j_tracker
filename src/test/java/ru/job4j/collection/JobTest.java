package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void whenJobAscByPriority() {
        List<Job> list = new ArrayList<>();
        list.add(new Job("Rsl", 5));
        list.add(new Job("Senior", 3));
        list.add(new Job("Dev", 2));
        Collections.sort(list, new JobAscByPriority());
        List<Job> expected = new ArrayList<>();
        expected.add(new Job("Dev", 2));
        expected.add(new Job("Senior", 3));
        expected.add(new Job("Rsl", 5));
        assertEquals(expected, list);
    }

    @Test
    public void whenJobDescByPriority() {
        List<Job> list = new ArrayList<>();
        list.add(new Job("Rsl", 5));
        list.add(new Job("Senior", 3));
        list.add(new Job("Dev", 2));
        Collections.sort(list, new JobDescByPriority());
        List<Job> expected = new ArrayList<>();
        expected.add(new Job("Rsl", 5));
        expected.add(new Job("Senior", 3));
        expected.add(new Job("Dev", 2));
        assertEquals(expected, list);
    }

    @Test
    public void whenJobAscBynName() {
        List<Job> list = new ArrayList<>();
        list.add(new Job("Rsl", 5));
        list.add(new Job("Senior", 3));
        list.add(new Job("Dev", 2));
        Collections.sort(list, new JobAscName());
        List<Job> expected = new ArrayList<>();
        expected.add(new Job("Dev", 2));
        expected.add(new Job("Rsl", 5));
        expected.add(new Job("Senior", 3));
        assertEquals(expected, list);
    }

    @Test
    public void whenJobDescBynName() {
        List<Job> list = new ArrayList<>();
        list.add(new Job("Rsl", 5));
        list.add(new Job("Senior", 3));
        list.add(new Job("Dev", 2));
        Collections.sort(list, new JobDescByName());
        List<Job> expected = new ArrayList<>();
        expected.add(new Job("Senior", 3));
        expected.add(new Job("Rsl", 5));
        expected.add(new Job("Dev", 2));
        assertEquals(expected, list);
    }

    @Test
    public void whenComparatorJobAscByNameAndAscPriority() {
        Comparator<Job> comparator = new JobAscName().thenComparing(new JobAscByPriority());
        int rsl = comparator.compare(
                new Job("Rsl", 0),
                new Job("Rsl", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorJobDescByNameAndDescPriority() {
        Comparator<Job> comparator = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = comparator.compare(
                new Job("Senior", 1),
                  new Job("Senior", 0)
        );
        assertThat(rsl).isLessThan(0);
    }
}