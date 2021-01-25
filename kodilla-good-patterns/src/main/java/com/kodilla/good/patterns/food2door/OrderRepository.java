package com.kodilla.good.patterns.food2door;

public interface OrderRepository {
    void createOrder(Supplier supplier, Product product, String deliveryPlace, int deliveryTime);
}
