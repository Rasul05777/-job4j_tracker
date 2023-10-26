package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("qwerty@mail.ru", "Petr Arsentev");
        map.put("asdfg@gmail.ru", "Itadori Udzi");
        map.put("asdfg@gmail.ru", "Rasul Khizriev");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

    }
}
