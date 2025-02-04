package edu.neu.csye7374;

public class LazySingletonAdobeStockFactory {
    private static LazySingletonAdobeStockFactory instance = null;

    private LazySingletonAdobeStockFactory() {
    }

    public static LazySingletonAdobeStockFactory getInstance() {
        if (instance == null) {
            synchronized (LazySingletonAdobeStockFactory.class) {
                if (instance == null) {
                    instance = new LazySingletonAdobeStockFactory();
                }
            }
        }
        return instance;
    }

    public AdobeStock createAdobeStock(String id, String name, Double price, String description) {
        return new AdobeStock(id, name, price, description);
    }
}
