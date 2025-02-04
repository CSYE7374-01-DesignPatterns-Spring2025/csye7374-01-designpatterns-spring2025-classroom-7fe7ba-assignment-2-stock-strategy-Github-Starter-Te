package edu.neu.csye7374;

public abstract class LazySingletonAdobeStockFactory implements AbstractFactory {
    private static LazySingletonAdobeStockFactory instance = null;

    private LazySingletonAdobeStockFactory() {
        // private constructor
    }

    public static LazySingletonAdobeStockFactory getInstance() {
        if(instance == null){
            // "lazy" initialization
            instance = new LazySingletonAdobeStockFactory() {
                @Override
                public StockAPI createStock(String id, String name, Double price, String description) {
                    return new AdobeStock(id, name, price, description);
                }
            };
        }
        return instance;
    }
}
