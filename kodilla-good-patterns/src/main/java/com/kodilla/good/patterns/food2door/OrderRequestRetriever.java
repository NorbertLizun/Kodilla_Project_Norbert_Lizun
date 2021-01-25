package com.kodilla.good.patterns.food2door;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Supplier supplier = new Supplier("ExtraFoodShop");
        Product product = new Product("Watermelon", 1000);
        String deliveryPlace = "Sklep: Grochóweczka";
        int deliveryTime = 4;

        return new OrderRequest(supplier, product, deliveryPlace, deliveryTime);
    }
}
