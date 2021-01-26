package com.kodilla.good.patterns.food2door;

public class Shop1 implements OrderService {
    @Override
    public boolean order(OrderRequest orderRequest) {
        if (orderRequest.getProduct().equals("Burak") && orderRequest.getProductID() == 132) {
        System.out.println("Zamówienie - Firma: " + orderRequest.getCompanyName() + " Produkt: " + orderRequest.getProduct()
               + " ID: " + orderRequest.getProductID() + " Ilość: " + orderRequest.getProductQuantity());
        return true;
        } else {
            System.out.println("Zostały wprowadzone niepoprawde dane");
            return false;
        }
    }
}
