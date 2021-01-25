package com.kodilla.good.patterns.food2door;

public class OrderDto {

    private Supplier supplier;
    private boolean isOrdered;

    public OrderDto(Supplier supplier, boolean isOrdered) {
        this.supplier = supplier;
        this.isOrdered = isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
