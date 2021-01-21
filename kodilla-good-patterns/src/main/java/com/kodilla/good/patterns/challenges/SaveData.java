package com.kodilla.good.patterns.challenges;

public class SaveData implements PurchaseRepository {

    @Override
    public void createPurchase(User user, Item item, String deliveryPlace, int deliveryTime) {
        System.out.println("Save order -  User: " + user.getFirstName() + " Item: " + item.getItemName() + " Where: " + deliveryPlace + " Delivery time:" + deliveryTime + " days");
    }
}
