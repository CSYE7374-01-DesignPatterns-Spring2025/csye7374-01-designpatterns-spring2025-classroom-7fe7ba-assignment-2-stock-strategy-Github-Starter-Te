package edu.neu.csye7374;

public class NSE {
    private static NSE instance = null;

    private NSE() {
    }

    public static synchronized NSE getInstance() {
        if (instance == null) {
            instance = new NSE();
        }
        return instance;
    }

    public static void startTrading() {
        NSE nse = NSE.getInstance();

        // apple is lazy initialization
        Stock appleStock = AppleStockFactory.getInstance().createStock("123", "APPL", 199.0, "Apple Stock price", 0);

        // adobe is eager initialization
        Stock adobeStock = AdobeStockFactory.getInstance().createStock("456", "ADBE", 299.0, "Adobe Stock price", 0);

        System.out.println("Stocks before trading");
        System.out.println(adobeStock);
        System.out.println(appleStock);


        System.out.println("\n");
        System.out.println("Stocks after trading bear market for Adobe and bull market for Apple");
        adobeStock.setMarketStrategy(new BearMarketStrategy());
        adobeStock.tradeStock();
        System.out.println(adobeStock);


        appleStock.setMarketStrategy(new BullMarketStrategy());
        appleStock.tradeStock();
        System.out.println(appleStock);

        System.out.println("\n");
        System.out.println("Apple Stocks are raising 40% due to bull market and Adobe Stocks are falling 40% due to bear market");

    }

    
}
