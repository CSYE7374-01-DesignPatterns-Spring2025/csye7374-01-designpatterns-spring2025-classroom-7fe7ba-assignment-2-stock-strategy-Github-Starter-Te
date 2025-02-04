package edu.neu.csye7374;

public class AdobeStockFactory {
    public AdobeStock createAdobeStock(String id, String name, Double price, String description) {
        return new AdobeStock(id, name, price, description);
    }
    public static AdobeStockFactory getInstance() {
        return new AdobeStockFactory();
    }
}
