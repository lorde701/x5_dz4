package ru.x5.task2;

//        7.  Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью start(), stop().
//        Метод start – выводит на экран «SportCar поехал», метод stop -  «SportCar остановился».
public class SportCar extends Car{
    public SportCar(String model, String type, float weight, Engine engine) {
        super(model, type, weight, engine);
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
    }
}