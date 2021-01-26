package com.kodilla.good.patterns.food2door;

public class OrderRequest {

    private final String companyName;
    private final String product;
    private final int productQuantity;
    private int productID;
    private double maximumPricePerProduct;

    public OrderRequest(String companyName, String product, int productQuantity) {
        this.companyName = companyName;
        this.product = product;
        this.productQuantity = productQuantity;
    }

    public OrderRequest(String companyName, String product, int productQuantity, int productID) {
        this.companyName = companyName;
        this.product = product;
        this.productQuantity = productQuantity;
        this.productID = productID;
    }

    public OrderRequest(String companyName, String product, int productQuantity, double maximumPricePerProduct) {
        this.companyName = companyName;
        this.product = product;
        this.productQuantity = productQuantity;
        this.maximumPricePerProduct = maximumPricePerProduct;
    }

    public double getMaximumPricePerProduct() {
        return maximumPricePerProduct;
    }

    public int getProductID() {
        return productID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getProduct() {
        return product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
