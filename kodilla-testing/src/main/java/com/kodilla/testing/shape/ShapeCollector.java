package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapeList = new ArrayList<>();


    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    public ArrayList<Shape> addFigure(Shape shape) {
        shapeList.add(shape);
        return shapeList;
    }
    
    public ArrayList<Shape> removeFigure(Shape shape) {
        shapeList.remove(shape);
        return shapeList;
    }

    public Shape getFigure(int n) {
        return shapeList.get(n);
    }

    public String showFigures() {
        for(Shape shapeName : shapeList) {
            shapeName.getShapeName();
        }
        return shapeList.toString();
    }


}
