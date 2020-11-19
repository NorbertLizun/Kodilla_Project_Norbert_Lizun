package com.kodilla.testing.shape;

public class Rectangle implements Shape {
    private String name;
    private double a;
    private double b;

    public Rectangle(String name, double a, double b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public String getShapeName() {
        return this.name;
    }

    public double getFild() {
        return a * b;
    }

    @Override
    public String toString() {
        return name;
    }
}
