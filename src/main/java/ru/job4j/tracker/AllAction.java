package ru.job4j.tracker;

public class AllAction implements UserAction {
    @Override
    public String name() {
       return "Show all Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        Item[] item = tracker.findAll();
        if (item.length > 0) {
            for (Item items : item) {
                System.out.println(items);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}

