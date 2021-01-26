package com.kodilla.good.patterns.food2door;

public class SendInfo1 implements InformationService{
    @Override
    public void sendInfo(OrderRequest orderRequest) {
        System.out.println("Wiadomość Mail - Firma: " + orderRequest.getCompanyName() + " Produkt: " + orderRequest.getProduct()
                + " ID: " + orderRequest.getProductID() + " Ilość: " + orderRequest.getProductQuantity());
    }
}
