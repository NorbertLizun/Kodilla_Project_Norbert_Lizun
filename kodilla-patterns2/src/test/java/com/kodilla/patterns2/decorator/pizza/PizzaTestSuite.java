package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTestSuite {

    @Test
    public void basicTest() {
        PizzaOrder pizzaOrder = new BasicPizza();

        BigDecimal cost = pizzaOrder.getCost();

        assertEquals(new BigDecimal(15), cost);
    }


    @Test
    public void extraIngTest() {
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new ExtraIngredientsDecorator(pizzaOrder);

        List<String> list = pizzaOrder.getExtraIngredients();
        BigDecimal cost = pizzaOrder.getCost();

        assertEquals(2, list.size());
        assertEquals(new BigDecimal(25) , cost);
    }
}
