package ru.job4j.ex;

public class FIndEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (key.equals(index)) {
                rsl = index;
                break;
            }
            if (rsl == -1) {
                throw new ElementNotFoundException("Element not found");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"list1", "list2", "list3"};
        String key = "list4";
        try {
            indexOf(value, key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
