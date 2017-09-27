package com.benceborbely.solid.srp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProductExporter {

    private ProductLineFormatter productLineFormatter;

    public ProductExporter(ProductLineFormatter productLineFormatter) {
        this.productLineFormatter = productLineFormatter;
    }

    public void export(Product product) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(product.getSku() + ".txt"));
            out.write(this.productLineFormatter.getProductLine(product));
            out.close();
        } catch (IOException e) {
            //TODO LOG exception
        }
    }

}
