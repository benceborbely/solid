package com.benceborbely.solid.srp;

public class ProductDisplay {

    private ProductLineFormatter productLineFormatter;

    public ProductDisplay(ProductLineFormatter productLineFormatter) {
        this.productLineFormatter = productLineFormatter;
    }

    public void display(Product product) {
        System.out.println(this.productLineFormatter.getProductLine(product));
    }

}
