package ru.job4j.strartegy;

public class Square implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    " |_____| " + ln
                + " |     | " + ln
                + " |_____| " + ln;
    }
}
