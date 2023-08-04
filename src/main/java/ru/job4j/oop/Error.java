package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
        active = true;
        status = 300;
        message = "Intel Core I9-40300K";
    }

    public static void main(String[] args) {
        Error apple = new Error();
        apple.printInfo();
        Error computer = new Error(true, 500, "Intel Core I7-10700K");
        computer.printInfo();
        Error laptop = new Error(false, 400, "Intel Core I5-50800");
        laptop.printInfo();
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + active);
        System.out.println("SSD: " + status + " GB");
        System.out.println("Модель CPU: " + message);
    }
}