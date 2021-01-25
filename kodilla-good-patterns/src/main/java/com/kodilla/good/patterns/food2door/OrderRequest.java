package com.kodilla.good.patterns.food2door;

public class OrderRequest {

    private Supplier supplier;
    private Product product;
    private String placeOfDelivery;
    private int deliveryTime;

    public OrderRequest(Supplier supplier, Product product, String placeOfDelivery, int deliveryTime) {
        this.supplier = supplier;
        this.product = product;
        this.placeOfDelivery = placeOfDelivery;
        this.deliveryTime = deliveryTime;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public String getPlaceOfDelivery() {
        return placeOfDelivery;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }
}
