package practice.polymorphism.car;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {

    }

    public void accelerate() {

    }

    public void brake() {

    }
}

public class Main {
    public static void main(String[] args) {

    }
}
