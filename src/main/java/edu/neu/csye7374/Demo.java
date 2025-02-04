package edu.neu.csye7374;

public class Demo {
    public void startDemo() {
        // Usage of Factories (Factory Method + Singleton Factories)
        AdobeStockFactory adobeFactory = AdobeStockFactory.getInstance();
        AppleStockFactory appleFactory = AppleStockFactory.getInstance();

        StockAPI adobeStock1 = adobeFactory.createStock("ADB", "Adobe", 131.5, "Adobe Stock");
        StockAPI appleStock1 = appleFactory.createStock("AAPL", "Apple", 190.5, "Apple Stock");

        System.out.println("Using Factory Method Pattern:");
        System.out.println(adobeStock1);
        System.out.println(appleStock1);

        // Singleton Factories
        LazySingletonAdobeStockFactory lazyAdobeFactory = LazySingletonAdobeStockFactory.getInstance();
        EagerSingletonAppleStockFactory eagerAppleFactory = EagerSingletonAppleStockFactory.getInstance();

        StockAPI adobeStock2 = lazyAdobeFactory.createStock("ADB2", "Adobe2", 145.0, "Adobe Stock 2");
        StockAPI appleStock2 = eagerAppleFactory.createStock("AAPL2", "Apple2", 200.0, "Apple Stock 2");

        System.out.println("\nUsing Singleton Factories:");
        System.out.println(adobeStock2);
        System.out.println(appleStock2);
    }
}
