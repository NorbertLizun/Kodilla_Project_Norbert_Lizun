package com.kodilla.good.patterns.challenges;

public class PurchaseRequest {

    private User user;
    private Item item;
    private String deliveryPlace;
    private int deliveryTime;

    public PurchaseRequest(User user, Item item, String deliveryPlace, int deliveryTime) {
        this.user = user;
        this.item = item;
        this.deliveryPlace = deliveryPlace;
        this.deliveryTime = deliveryTime;
    }

    public Item getItem() {
        return item;
    }

    public User getUser() {
        return user;
    }

    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    @Override
    public String toString() {
        return "PurchaseRequest{" +
                "user=" + user +
                ", item=" + item +
                ", deliveryPlace='" + deliveryPlace + '\'' +
                ", deliveryTime=" + deliveryTime +
                '}';
    }
}
