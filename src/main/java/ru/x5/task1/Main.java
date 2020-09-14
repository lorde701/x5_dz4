package ru.x5.task1;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle( 4, 5,6);
        shape[1] = new Circle(1);
        shape[2] = new Rectangle(2, 5);
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }
    }
}
