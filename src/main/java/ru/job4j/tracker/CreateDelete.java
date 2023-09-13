package ru.job4j.tracker;

public class CreateDelete implements UserAction {
    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete id ===");
        int id = input.askInt("Enter id: ");
        tracker.delete(id);
        Item item = tracker.findById(id);
        System.out.println((item == null ? "Заявка удалена успешно" : "Ошибка удалении заявки"));
        return true;
    }
}
