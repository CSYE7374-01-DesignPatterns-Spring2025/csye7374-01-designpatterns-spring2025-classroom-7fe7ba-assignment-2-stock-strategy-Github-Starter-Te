package edu.neu.csye7374;

public class EagerSingletonAppleStockFactory {
    private static final EagerSingletonAppleStockFactory instance = new EagerSingletonAppleStockFactory();

    private EagerSingletonAppleStockFactory() {
    }

    public static EagerSingletonAppleStockFactory getInstance() {
        return instance;
    }

    public AppleStock createAppleStock(String id, String name, Double price, String description) {
        return new AppleStock(id, name, price, description);
    }
}
