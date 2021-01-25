package com.kodilla.good.patterns.food2door;


public class Main {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new SendInfo(), new Shop(), new SaveData());
        orderProcessor.process(orderRequest);
    }
}
