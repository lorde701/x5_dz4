package ru.x5.task2;

public class Lorry extends Car {
    private int cargoCapacity;

    public Lorry(String model, String type, float weight, Engine engine, int cargoCapacity) {
        super(model, type, weight, engine);
        this.cargoCapacity = cargoCapacity;
    }

    public void start() {
        System.out.println("Грузовик поехал");
    }

    public void stop() {
        System.out.println("Грузовик остановился");
    }

    public void printInfo() {
        System.out.println("Информация о грузовике");
        System.out.println("Модель автомобиля: " + model);
        System.out.println("Класс автомобиля: " + type);
        System.out.println("Вес автомобиля: " + weight);
        System.out.println("Двигатель автомобиля: " + engine);
        System.out.println("Грузоподъемность кузова: " + cargoCapacity);
    }
}
