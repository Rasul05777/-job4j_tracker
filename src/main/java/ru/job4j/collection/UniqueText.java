package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String origText, String duplicateText) {
        String[] origin = origText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> chek = new HashSet<>();
        for (String word : origin) {
            chek.add(word);
        }
        for (String words : text) {
            if (!chek.contains(words)) {
                return false;
            }
        }
        return true;
    }
}
