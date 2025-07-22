package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book milk = new Book("Milk", 10);
        Book bread = new Book("Bread", 4);
        Book egg = new Book("Egg", 19);
        Book cooder = new Book("Clean code", 25);
        Book[] products = new Book[4];
        products[0] = milk;
        products[1] = bread;
        products[2] = egg;
        products[3] = cooder;

        for (int index = 0; index < products.length; index++) {
            Book product = products[index];
            System.out.println(product.getName() + " - " + product.getCount());
        }

        System.out.println("Change index 0 to 3.");
        for (int index = 0; index < products.length; index++) {
            if (index == 0) {
                Book came = products[3];
                products[3] = products[0];
                products[0] = came;
                System.out.println(came.getName() + " - " + came.getCount());
            } else {
                Book name = products[index];
                System.out.println(name.getName() + " - " + name.getCount());
            }
        }
        System.out.println("Show book Clean code");
        for (int index = 0; index < products.length; index++) {
            Book product = products[index];
            if (product.getName().equals("Clean code")) {
                System.out.println(product.getName() + " - " + product.getCount());
            }
        }
    }
}
