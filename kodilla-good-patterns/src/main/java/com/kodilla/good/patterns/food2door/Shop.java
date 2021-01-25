package com.kodilla.good.patterns.food2door;

public class Shop implements OrderService {

    @Override
    public boolean order(Supplier supplier, Product product, String deliveryPlace, int deliveryTime) {

        if (product.getProductQuantity() > 100) {
            System.out.println("Not enough product, try again");
        return false;

        } else {

            return true;

        }
    }
}
