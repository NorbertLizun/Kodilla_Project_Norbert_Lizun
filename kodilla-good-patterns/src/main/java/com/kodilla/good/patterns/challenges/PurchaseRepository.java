package com.kodilla.good.patterns.challenges;

public interface PurchaseRepository {
    void createPurchase(User user,Item item, String deliveryPlace, int deliveryTime);
}
