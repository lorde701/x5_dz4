package ru.x5.task2;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(String model, String type, float weight, Engine engine, int maxSpeed) {
        super(model, type, weight, engine);
        this.maxSpeed = maxSpeed;
    }

    public void start() {
        System.out.println("SportCar поехал");
    }

    public void stop() {
        System.out.println("SportCar остановился");
    }

    public void printInfo() {
        System.out.println("Информация о спортивной машине");
        System.out.println("Модель автомобиля: " + model);
        System.out.println("Класс автомобиля: " + type);
        System.out.println("Вес автомобиля: " + weight);
        System.out.println("Двигатель автомобиля: " + engine);
        System.out.println("Предельная скорость: " + maxSpeed);
    }
}
