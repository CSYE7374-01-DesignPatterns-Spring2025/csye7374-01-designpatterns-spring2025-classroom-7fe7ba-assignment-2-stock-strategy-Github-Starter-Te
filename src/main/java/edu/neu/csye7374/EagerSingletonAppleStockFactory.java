package edu.neu.csye7374;

public abstract class EagerSingletonAppleStockFactory implements AbstractFactory {
    private static final EagerSingletonAppleStockFactory instance = null;

    private EagerSingletonAppleStockFactory() {
        // private constructor
    }

    public static EagerSingletonAppleStockFactory getInstance() {
        return new EagerSingletonAppleStockFactory() {
            @Override
            public StockAPI createStock(String id, String name, Double price, String description) {
                return new AppleStock(id, name, price, description);
            }
        };
    }
}
