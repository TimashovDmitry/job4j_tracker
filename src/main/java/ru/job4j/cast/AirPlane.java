package ru.job4j.cast;

public class AirPlane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Летит по воздуху.");
    }
}
