package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private final double a;
    private final double h;
    private final String name;

    public Triangle(double a, double h, String name) {
        this.a = a;
        this.h = h;
        this.name = name;
    }

    public String getShapeName() {
        return this.name;
    }
    public double getFild() {
        return a * h / 2;
    }

    @Override
    public String toString() {
        return name;
    }
}
