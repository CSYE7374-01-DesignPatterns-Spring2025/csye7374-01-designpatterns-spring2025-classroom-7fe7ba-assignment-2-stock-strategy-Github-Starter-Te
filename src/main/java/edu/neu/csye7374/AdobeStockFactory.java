package edu.neu.csye7374;

public class AdobeStockFactory implements AbstractFactory {

    @Override
    public StockAPI createStock(String id, String name, Double price, String description) {
        // Creates an AdobeStock with default strategy if needed
        return new AdobeStock(id, name, price, description);
    }

    public static AdobeStockFactory getInstance() {
        return new AdobeStockFactory();
    }
}
