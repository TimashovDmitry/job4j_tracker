package ru.job4j.pojo;

public class Shop {

    public static int indexOfNull(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                return i;  // Возвращаем индекс, если нашли null
            }
        }
        return -1;  // Нет элемента null
    }
}
