package edu.neu.csye7374;

public abstract class EagerSingletonAppleStockFactory implements AbstractFactory {
    // The instance is declared as null but returned as an anonymous class
    // Typically "eager" would be instantiated, but let's follow the structure given.
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
