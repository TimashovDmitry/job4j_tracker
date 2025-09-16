package ru.job4j.tracker;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item obj = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = obj.getCreated().format(formatter);
        System.out.println(currentDateTimeFormat);
        Item obj1 = new Item();
        System.out.println(obj1);

    }
}
