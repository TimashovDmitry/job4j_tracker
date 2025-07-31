package ru.job4j.tracker;

import java.util.Arrays;
public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] result = new Item[size];
        int n = 0;
        for (int index = 0; index <= size - 1; index++) {
            if (items[index] != null) {
                result[n] = items[index];
                n++;
            }
            result = Arrays.copyOf(result, n + 1);
        }
        return result;
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int n = 0;
        for (int index = 0; index < size - 1; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                result[n] = items[index];
                n++;
            }
            result = Arrays.copyOf(result, n + 1);
        }
        return result;
    }

        public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}