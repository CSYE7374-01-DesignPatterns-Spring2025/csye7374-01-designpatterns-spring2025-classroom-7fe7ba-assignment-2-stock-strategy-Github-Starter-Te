package edu.neu.csye7374;


public class AppleStockFactory implements AbstractFactory {
    private static AppleStockFactory instance = null;
    @Override
    public StockAPI createStock(String id, String name, Double price, String description, int metric) {
        return new AppleStock(id, name, price, description, metric);
    }

    // Lazy implementation of factory
    public static synchronized AppleStockFactory getInstance() {
        if (instance == null) {
            instance = new AppleStockFactory();
        }
        return instance;
    }
    
}
