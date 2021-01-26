package com.kodilla.good.patterns.food2door;

public class SaveOrder implements OrderRepository{

    @Override
    public void saveOrder(OrderRequest orderRequest) {
        System.out.println("Zapis Danych - Firma: " + orderRequest.getCompanyName() + " Produkt: " + orderRequest.getProduct()
                + " Ilość: " + orderRequest.getProductQuantity());
    }
}
