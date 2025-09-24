package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {

        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                return index;
            }
        }
        throw new ElementNotFoundException("Элемент не найден");
    }

    public static void main(String[] args) {
        String[] value = {"Привет", "Мир"};
        try {
            int index = indexOf(value, "Abc");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
