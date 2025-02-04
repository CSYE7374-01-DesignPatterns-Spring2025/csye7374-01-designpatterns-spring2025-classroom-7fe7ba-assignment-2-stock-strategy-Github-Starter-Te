package edu.neu.csye7374;

public class NSE {
    private static NSE instance = null;
    private MarketStrategy marketStrategy;

    private NSE() {
    }

    public static synchronized NSE getInstance() {
        if (instance == null) {
            instance = new NSE();
        }
        return instance;
    }

    public void setMarketStrategy(MarketStrategy strategy) {
        this.marketStrategy = strategy;
    }

    public void tradeStock(StockAPI stock) {
        this.marketStrategy.tradeStock(stock);
    }

    public static void startTrading() {
        NSE nse = NSE.getInstance();

        // apple is lazy initialization
        StockAPI appleStock = AppleStockFactory.getInstance().createStock("123", "APPL", 199.0, "Apple Stock price", 0);

        // adobe is eager initialization
        StockAPI adobeStock = AdobeStockFactory.getInstance().createStock("456", "ADBE", 299.0, "Adobe Stock price", 0);

        System.out.println("Stocks before trading");
        System.out.println(adobeStock);
        System.out.println(appleStock);


        System.out.println("\n");
        System.out.println("Stocks after trading bear market for Adobe and bull market for Apple");
        nse.setMarketStrategy(new BearMarketStrategy());
        nse.tradeStock(adobeStock);
        System.out.println(adobeStock);


        nse.setMarketStrategy(new BullMarketStrategy());
        nse.tradeStock(appleStock);
        System.out.println(appleStock);

        System.out.println("\n");
        System.out.println("Apple Stocks are falling 40% due to bear market and Adobe Stocks are rising 40% due to bull market");

    }

    
}
