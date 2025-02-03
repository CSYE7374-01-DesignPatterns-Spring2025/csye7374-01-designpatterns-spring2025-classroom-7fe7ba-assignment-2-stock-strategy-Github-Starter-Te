package edu.neu.csye7374;

public class GoogleBullMarketStrategy implements StockPriceStrategy {

    @Override
    public double computePrice(StockAPI stock, double newPrice) {
        double currentPrice = stock.getPrice();
        // Different logic for Google in a bull market
        if (newPrice > currentPrice) {
            // For example, add a flat 5% of the current price on top
            return newPrice + (0.05 * currentPrice);
        } else {
            // If going down, just set it to the newPrice
            return newPrice;
        }
    }
}