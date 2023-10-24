package ru.job4j.collection;
import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;
    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        Customer lastHappyCustomer = null;
        for (int i = 0; i < count; i++) {
           lastHappyCustomer = queue.poll();
        }

        return lastHappyCustomer.name();
    }

    public String getFirstUpsetCustomer() {
        Customer firstCustomer = null;
        for (int i = 0; i <= count; i++) {
          firstCustomer =   queue.poll();
        }
        return firstCustomer.name();
    }

}
