package polymorphism;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Движение автобуса");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Число пассажиров автобуса");
    }

    @Override
    public int refuel(int fuel) {
        System.out.println("уровень горючего автобуса");
        return 0;
    }
}
