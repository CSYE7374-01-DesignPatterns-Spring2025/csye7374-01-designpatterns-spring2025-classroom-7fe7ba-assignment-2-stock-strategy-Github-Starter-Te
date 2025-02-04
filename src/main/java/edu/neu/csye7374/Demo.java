package edu.neu.csye7374;

public class Demo {
    public void startDemo() {
        System.out.println("============Main Execution Start===================\n\n");

        // Factory Method Pattern
        AdobeStockFactory adobeFactory = AdobeStockFactory.getInstance();
        AppleStockFactory appleFactory = AppleStockFactory.getInstance();

        StockAPI adobeStock1 = adobeFactory.createAdobeStock("ADB", "Adobe", 131.5, "Adobe Stock");
        StockAPI appleStock1 = appleFactory.createAppleStock("AAPL", "Apple", 190.5, "Apple Stock");

        System.out.println("Using Factory Method Pattern:");
        System.out.println(adobeStock1);
        System.out.println(appleStock1);

        //Setting strategy here
        System.out.println("Setting Strategy for Apple nad Adobe Stocks:");

        CalculateMetrics cm = new CalculateMetrics();
        cm.calculateMetrics();

        // System.out.println("Placing Bids on Adobe(Bear) Stock:");
        // adobeStock1.setBid("200");
        // adobeStock1.setBid("500");
        // adobeStock1.setBid(("350"));
        // adobeStock1.setBid("375");
        // System.out.println(adobeStock1.toString());

        // Singleton Factories
        // LazySingletonAdobeStockFactory lazyAdobeFactory = LazySingletonAdobeStockFactory.getInstance();
        // EagerSingletonAppleStockFactory eagerAppleFactory = EagerSingletonAppleStockFactory.getInstance();
        // StockAPI adobeStock2 = lazyAdobeFactory.createAdobeStock("ADB2", "Adobe2", 145.0, "Adobe Stock 2");
        // StockAPI appleStock2 = eagerAppleFactory.createAppleStock("AAPL2", "Apple2", 200.0, "Apple Stock 2");

        // System.out.println("\nUsing Singleton Factories:");
        // System.out.println(adobeStock2);
        // System.out.println(appleStock2);

        System.out.println("\n============Main Execution End===================");
    }
}
