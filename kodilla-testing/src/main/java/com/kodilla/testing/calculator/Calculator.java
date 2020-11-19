package com.kodilla.testing.calculator;

public class Calculator {
    private int addResult;
    private int subResult;

    public int getAddResult() {
        return this.addResult;
    }

    public int getSubResult() {
        return this.subResult;
    }

    public int add(int a, int b) {
        addResult = a + b;
        return addResult;
    }

    public int subtract(int a, int b) {
        subResult = a - b;
        return subResult;
    }
}
