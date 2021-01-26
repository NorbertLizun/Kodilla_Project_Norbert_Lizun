package com.kodilla.good.patterns.food2door;

public class Main {

    public static void main(String[] args) {

        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(new Shop1(), new SendInfo1(), new SaveOrder());
        ExtraFoodShop extraFoodShop = new ExtraFoodShop(new Shop(), new SendInfo(), new SaveOrder());
        HealthyShop healthyShop = new HealthyShop(new Shop2(), new SendInfo2(), new SaveOrder());

        OrderRequest orderRequest1 = new OrderRequest("GlutenFreeShop", "Burak", 200, 132);
        OrderRequest orderRequest = new OrderRequest("ExtraFoodShop", "Pomidor", 27);
        OrderRequest orderRequest2 = new OrderRequest("HealthyShop", "Masło", 10,1.9);


        extraFoodShop.process(orderRequest);
        System.out.println("=======");
        glutenFreeShop.process(orderRequest1);
        System.out.println("=======");
        healthyShop.process(orderRequest2);


    }
}
