package ru.x5.task2;

public class Engine {
    private float power;
    private String producer;

    public Engine(float power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return String.format("Двигатель[производитель - %s, мощность - %s л.с.]", producer, power);
    }
}
