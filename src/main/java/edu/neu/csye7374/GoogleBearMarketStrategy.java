package edu.neu.csye7374;

public class GoogleBearMarketStrategy implements StockPriceStrategy {

    @Override
    public double computePrice(StockAPI stock, double newPrice) {
        double currentPrice = stock.getPrice();

        if (newPrice < currentPrice) {
            // Drop is steeper: e.g., drop an extra 2% of current price
            return newPrice - (0.02 * currentPrice);
        } else {
            // If going up, reduce it slightly
            double increase = newPrice - currentPrice;
            return currentPrice + (increase * 0.7);
        }
    }
}
