package com.kodilla.good.patterns.food2door;

public class SendInfo2 implements InformationService {

    @Override
    public void sendInfo(OrderRequest orderRequest) {
        System.out.println("Wiadomość SMS : " + orderRequest.getCompanyName() + " Produkt: " + orderRequest.getProduct()
                + " Cena za Sztuke: " + orderRequest.getMaximumPricePerProduct() + " Ilość: " + orderRequest.getProductQuantity());
    }
}
