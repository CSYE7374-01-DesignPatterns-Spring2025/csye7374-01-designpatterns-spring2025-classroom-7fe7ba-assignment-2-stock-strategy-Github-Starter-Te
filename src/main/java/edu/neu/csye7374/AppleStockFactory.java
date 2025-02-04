package edu.neu.csye7374;

public class AppleStockFactory implements AbstractFactory {
    @Override
    public StockAPI createStock(String id, String name, Double price, String description) {
        // Creates an AppleStock with default strategy if needed
        return new AppleStock(id, name, price, description);
    }

    public static AppleStockFactory getInstance() {
        return new AppleStockFactory();
    }
}
