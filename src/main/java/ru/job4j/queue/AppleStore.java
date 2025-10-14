package ru.job4j.queue;

import java.util.Queue;
public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        Customer nextCustomer = queue.poll();
        for (int i = 0; i <  count - 1; i++) {
            nextCustomer = queue.poll();

        }
        return nextCustomer.name();
    }

    public String getFirstUpsetCustomer() {
        Customer nextCustomer = queue.poll();
        for (int i = 0; i <  count; i++) {
            nextCustomer = queue.poll();

        }
        return nextCustomer.name();
    }
}
