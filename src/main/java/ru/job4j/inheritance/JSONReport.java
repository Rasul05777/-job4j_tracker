package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    public String generate(String name, String body) {
        String l = System.lineSeparator();
        String s = "\"";
        return "{" + l
                +
                "\t\"name\"" + " : " + s + name + s + "," + l
                +
                "\t\"body\"" + " : " + s + body + s + l
                +
                "}";
    }
}
