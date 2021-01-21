package com.kodilla.good.patterns.challenges;

public class PurchaseRequestRetriever {

    public PurchaseRequest retrieve() {
        User user = new User("Kuba", "Szarik");
        Item item = new Item("Szczota");
        String deliveryPlace = "Adres 12/3";
        int deliveryTime = 5;

        return new PurchaseRequest(user, item, deliveryPlace, deliveryTime);


    }
}
