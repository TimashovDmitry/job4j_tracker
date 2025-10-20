package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order process: orders) {
           map.put(process.getNumber(), process);
        }
        /* for orders */
        return map;
    }
}
