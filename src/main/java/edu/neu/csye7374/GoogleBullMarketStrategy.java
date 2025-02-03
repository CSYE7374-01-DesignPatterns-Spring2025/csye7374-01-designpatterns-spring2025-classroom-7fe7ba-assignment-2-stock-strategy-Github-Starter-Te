package edu.neu.csye7374;

public class GoogleBullMarketStrategy implements StockPriceStrategy {

    @Override
    public double computePrice(StockAPI stock, double newPrice) {
        double currentPrice = stock.getPrice();

        if (newPrice > currentPrice) {
            // Add a flat 5% of the current price on top
            return newPrice + (0.05 * currentPrice);
        } else {
            // If going down, set it to the newPrice
            return newPrice;
        }
    }
}