package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExtraIngredientsDecorator extends AbstractPizzaDecorator{

    private List<String> IngList = super.getExtraIngredients();



    protected ExtraIngredientsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(IngList.size() * 5));
    }

    @Override
    public List<String> getExtraIngredients() {
        IngList.add("Szynka");
        IngList.add("Ser");
        return IngList;
    }
}
