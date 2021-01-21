package com.kodilla.good.patterns.challenges;

public class Main {

    public static void main(String[] args) {


        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest = purchaseRequestRetriever.retrieve();
        ProductOrderService productOrderService = new ProductOrderService(new SendInfoMail(), new Shop(), new SaveData());
        productOrderService.process(purchaseRequest);





    }
}
