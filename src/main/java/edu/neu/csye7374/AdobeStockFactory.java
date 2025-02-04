package edu.neu.csye7374;


// Eager singleton implementation of factory
public class AdobeStockFactory implements AbstractFactoryAPI {
    private static final AdobeStockFactory instance = new AdobeStockFactory();

    @Override
    public Stock createStock(String id, String name, Double price, String description, int metric) {
        return new AdobeStock(id, name, price, description, metric);
    }

    public static AdobeStockFactory getInstance() {
        return instance;
    }
}
