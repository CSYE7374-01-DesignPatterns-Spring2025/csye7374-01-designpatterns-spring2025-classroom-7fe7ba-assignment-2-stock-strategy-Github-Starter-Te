package edu.neu.csye7374;

public class NetflixBearMarketStrategy implements StockPriceStrategy {

    @Override
    public double computePrice(StockAPI stock, double newPrice) {
        double currentPrice = stock.getPrice();
        // Example: In a bear market, if newPrice < currentPrice,
        // the price might drop more aggressively.
        if (newPrice < currentPrice) {
            // Decrease aggressively (e.g., 10% more than the difference)
            double diff = currentPrice - newPrice;
            return currentPrice - diff - (0.1 * diff);
        } else {
            // If price is going up in a bear market, it's dampened
            double diff = newPrice - currentPrice;
            return currentPrice + (diff * 0.1);
        }
    }
}
