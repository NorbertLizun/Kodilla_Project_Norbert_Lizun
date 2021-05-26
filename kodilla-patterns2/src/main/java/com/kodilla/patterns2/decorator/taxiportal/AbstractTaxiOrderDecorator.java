package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public abstract class AbstractTaxiOrderDecorator implements TaxiOrder{

    private final TaxiOrder taxiOrder;

    protected AbstractTaxiOrderDecorator(TaxiOrder taxiOrder) {
        this.taxiOrder = taxiOrder;
    }

    @Override
    public BigDecimal getCost() {					// [5]
        return taxiOrder.getCost();
    }

    @Override
    public String getDescription() {					// [6]
        return taxiOrder.getDescription();
    }
}
