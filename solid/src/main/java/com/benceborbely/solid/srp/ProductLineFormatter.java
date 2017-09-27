package com.benceborbely.solid.srp;

public class ProductLineFormatter {

    public String getProductLine(Product product) {
        return "Sku: " + product.getSku() + ", Name: " + product.getName() + ", Price: " + product.getPrice();
    }

}
