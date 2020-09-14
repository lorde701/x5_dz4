package ru.x5.task2;

public abstract class Car {
    protected final String model;
    protected final String type;
    protected final float weight;
    protected final Engine engine;

    public Car(String model, String type, float weight, Engine engine) {
        this.model = model;
        this.type = type;
        this.weight = weight;
        this.engine = engine;
    }

    public abstract void start();

    public abstract void stop();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public abstract void printInfo();
}
