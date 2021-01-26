package com.kodilla.good.patterns.food2door;

public class Shop2 implements OrderService{
    @Override
    public boolean order(OrderRequest orderRequest) {
        if (orderRequest.getMaximumPricePerProduct() < 2.1) {
            System.out.println("Zamówienie - Firma: " + orderRequest.getCompanyName() + " Produkt: " + orderRequest.getProduct()
                    + " Max Cena za Sztuke: " + orderRequest.getMaximumPricePerProduct() + " Ilość: " + orderRequest.getProductQuantity());
            return true;
        } else {
            System.out.println("Cena produktu jest za wysoka");
            return false;
        }
    }
}
