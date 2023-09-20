package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete id ===");
        int id = input.askInt("Enter id: ");
        tracker.delete(id);
        Item item = tracker.findById(id);
        out.println((item == null ? "Заявка удалена успешно" : "Ошибка удалении заявки"));
        return true;
    }
}


