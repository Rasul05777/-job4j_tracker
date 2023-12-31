package ru.job4j.tracker;

public class FindIdAction implements UserAction {
    private final Output out;

    FindIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "FInd item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by id ===");
        int id = input.askInt("Enter id ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Заявка с введеным id: " + id + " не найдена");
        }
        return true;
    }
}


