package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        autos.add("Petr");
        autos.add("Ivan");
        autos.add("Ivan");
        autos.add("Vasily");
        for (String name : autos) {
            System.out.println(name);
        }
    }
}
