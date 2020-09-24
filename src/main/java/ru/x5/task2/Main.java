package ru.x5.task2;

public class Main {
    public static void main(String[] args) {
        Car[] array = {
                new SportCar("Audi R8", "Спортивный автомобиль", 1595f,
                        new Engine(420, "unknown"), 320),

                new Lorry("KamAZ 65207", "Грузовой автомобиль", 26000f,
                        new Engine(401, "Mercedes-Benz"), 14725)

        };

        for (Car car: array) {
            car.start();
            car.stop();
            car.printInfo();
            System.out.println();
        }
    }
}
