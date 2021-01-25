package com.kodilla.good.patterns.food2door;

public class SaveData implements OrderRepository {

    @Override
    public void createOrder(Supplier supplier, Product product, String deliveryPlace, int deliveryTime) {
        System.out.println("Save order - Supplier: " + supplier.getSupplierName() + " Product: " + product.getProductName() + " Quantity: " + product.getProductQuantity() + " Delivery Place: " + deliveryPlace + " Delivery Time: " + deliveryTime + " days");
    }
}
