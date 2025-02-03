package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {

    private static StockMarket instance;
    private List<StockAPI> stocks;

    private StockMarket() {
        stocks = new ArrayList<>();
    }

    public static StockMarket getInstance() {
        if (instance == null) {
            synchronized (StockMarket.class) {
                if (instance == null) {
                    instance = new StockMarket();
                }
            }
        }
        return instance;
    }

    public void addStock(StockAPI stock) {
        stocks.add(stock);
    }

    public void showAllStocks() {
        for (Tradable stock : stocks) {
            System.out.println(stock);
        }
    }

    public void tradeStocks(String name, String bid) {
        for (StockAPI stock : stocks) {
            if (stock.getName().equals(name)) {
                System.out.println("Bid received for " + name + ": $" + bid);
                stock.setBid(bid);
            }
        }
    }

    public void removeStock(String name) {
        int index = -1;
        for (int i = 0; i < stocks.size(); i++) {
            if (stocks.get(i).getName().equals(name)) {
                index = i;
            }
        }
        if (index != -1)
            stocks.remove(index);
    }

    public void startTrading() {
        System.out.println("=== Trading starts here ===");

        // Create NetflixStock with a Bull Market strategy
        NetflixStock netflix = new NetflixStock(
                "NetflixStock",
                50,
                "This is the stock for Netflix",
                new NetflixBullMarketStrategy()
        );

        // Create GoogleStock with a Bear Market strategy
        GoogleStock google = new GoogleStock(
                "GoogleStock",
                150,
                "This is the stock for Google/Alphabet LLC",
                new GoogleBearMarketStrategy()
        );

        // Add them to the stock market
        this.addStock(netflix);
        this.addStock(google);

        System.out.println("\nAll the stocks available in the stock market at the start:");
        showAllStocks();

        // Bid 1: Bull Market for Netflix
        tradeStocks("NetflixStock", "60");  // Expect price to increase in bull market
        tradeStocks("GoogleStock", "142");  // Google slightly drops in bear market
        System.out.println("\nAfter bid 1:");
        showAllStocks();

        // Switch Netflix to a Bear Market strategy
        netflix.setStrategy(new NetflixBearMarketStrategy());
        System.out.println("\n[Switched Netflix to BearMarketStrategy]\n");

        // Bid 2: Netflix should not increase significantly or may drop under Bear Market conditions
        tradeStocks("NetflixStock", "70");
        tradeStocks("GoogleStock", "130");   // Google already in Bear
        System.out.println("\nAfter bid 2:");
        showAllStocks();

        // Switch Google to a Bull Market strategy
        google.setStrategy(new GoogleBullMarketStrategy());
        System.out.println("\n[Switched Google to BullMarketStrategy]\n");

        // Next trades
        tradeStocks("NetflixStock", "40");   // Netflix Bear scenario
        tradeStocks("GoogleStock", "160");   // Google Bull scenario
        System.out.println("\nAfter bid 3:");
        showAllStocks();

        // Remove NetflixStock from the market
        removeStock("NetflixStock");
        System.out.println("\nStocks available after removing NetflixStock:");
        showAllStocks();

        System.out.println("=== Trading ends here ===");
    }
}
