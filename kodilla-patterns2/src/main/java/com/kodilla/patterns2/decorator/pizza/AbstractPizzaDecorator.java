package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class AbstractPizzaDecorator implements PizzaOrder {

    private final PizzaOrder pizzaOrder;

    protected AbstractPizzaDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public List<String> getExtraIngredients() {
        return pizzaOrder.getExtraIngredients();
    }
}
