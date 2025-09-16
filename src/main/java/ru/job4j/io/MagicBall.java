
package ru.job4j.io;
import java.util.Scanner;
import java.util.Random;
public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.print("Да");
        }
        if (answer == 1) {
            System.out.print("Нет");
        }
        if (answer != 1 && answer != 0) {
                System.out.print("может быть");
        }
    }
}
