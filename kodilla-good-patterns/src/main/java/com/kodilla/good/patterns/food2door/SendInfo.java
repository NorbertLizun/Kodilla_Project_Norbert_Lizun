package com.kodilla.good.patterns.food2door;

public class SendInfo  implements  InformationService{

    @Override
    public void sendInfo(Supplier supplier, Product product) {
        System.out.println("Message to user - Hello! You just bought " + product.getProductName() + " in an amount: "+ product.getProductQuantity() + " Supplier: " + supplier.getSupplierName() + "! Thank you for using our services.....");
    }
}
