package ru.job4j.inheritance;

public class HtmlReport extends TextReport {

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>"
                + "<br/>"
                + "<span>" + body + "</span>";
    }
}