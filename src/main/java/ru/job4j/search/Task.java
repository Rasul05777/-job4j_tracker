package ru.job4j.search;

public class Task {
    private String desc;
    private int prioirty;

    public Task(String desc, int prioirty) {
        this.desc = desc;
        this.prioirty = prioirty;
    }

    public String getDesc() {
        return desc;
    }

    public int getPrioirty() {
        return prioirty;
    }
}
