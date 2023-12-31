package ru.job4j.tracker;

import java.util.List;

public class AllAction implements UserAction {
    private final Output out;

    AllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ===");
        List<Item> item = tracker.findAll();
        if (item.size() > 0) {
            for (Item items : item) {
                out.println(items);
            }
        } else {
            out.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}

