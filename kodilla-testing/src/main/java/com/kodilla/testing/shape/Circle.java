package com.kodilla.testing.shape;

import java.lang.Math.*;

public class Circle implements Shape {
    private final String name;
    private final double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getShapeName() {
        return this.name;
    }
    public double getFild() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return name;
    }
}
