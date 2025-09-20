package ru.job4j.cast;

public class TransportType {
    public static void main(String[] args) {
        Vehicle airplane = new AirPlane();
        Vehicle fighter = new AirPlane();
        Vehicle train = new Train();
        Vehicle speedTrain = new Train();
        Vehicle bus = new Bus();
        Vehicle cityBus = new Bus();

        Vehicle[] transport = new Vehicle[]{airplane, fighter, train, speedTrain, bus, cityBus};
        for (Vehicle object : transport) {
            object.move();
        }
    }
}
