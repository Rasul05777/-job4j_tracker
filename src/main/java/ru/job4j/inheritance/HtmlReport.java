package ru.job4j.inheritance;

public class HtmlReport extends TextReport {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>"
                + "<br/>"
                + "<span>" + body + "</span>";
    }
}