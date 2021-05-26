package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BasicPizza implements PizzaOrder{

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public List<String> getExtraIngredients() {
        List<String> list = new ArrayList<>();
        return list;
    }
}
