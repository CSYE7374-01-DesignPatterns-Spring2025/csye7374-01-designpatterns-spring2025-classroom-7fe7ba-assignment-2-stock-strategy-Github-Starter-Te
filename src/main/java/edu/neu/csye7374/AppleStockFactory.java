package edu.neu.csye7374;

public class AppleStockFactory {
    public AppleStock createAppleStock(String id, String name, Double price, String description) {
        return new AppleStock(id, name, price, description);
    }
    public static AppleStockFactory getInstance() {
        return new AppleStockFactory();
    }
}
