package com.benceborbely.not.solid.srp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;

public class Product {

    private String sku;

    private String name;

    private BigDecimal price;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void discountPrice() {
        this.price = this.price.divide(new BigDecimal(2), 2, BigDecimal.ROUND_HALF_UP);
    }

    public void display() {
        System.out.println(this.getProductLine());
    }

    public void export() {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(sku + ".txt"));
            out.write(this.getProductLine());
            out.close();
        } catch (IOException e) {
            //TODO LOG exception
        }
    }

    private String getProductLine() {
        return "Sku: " + sku + ", Name: " + name + ", Price: " + price;
    }

}
