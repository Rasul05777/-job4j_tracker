package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        Set<String> el = new LinkedHashSet<>();
        for (String elements : deps) {
            String start = "";
            for (String newDeps : elements.split("/")) {
                start += newDeps;
                el.add(start);
                start += "/";
            }
        }
        return new ArrayList<>(el);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new SortDescDepartments());
    }
}
