package ru.x5.task1;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double square() {
        return Math.PI * r * r;
    }
}
