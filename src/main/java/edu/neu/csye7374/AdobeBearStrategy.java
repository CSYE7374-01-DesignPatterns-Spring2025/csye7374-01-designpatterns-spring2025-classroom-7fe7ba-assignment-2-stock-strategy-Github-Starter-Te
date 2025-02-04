package edu.neu.csye7374;

public class AdobeBearStrategy implements StockPriceStrategy {

    @Override
    public double computePrice(StockAPI stock, double newBid) {
        double currentPrice = stock.getPrice();
        // In a bear market, Adobe stock might drop more aggressively or rise less
        if (newBid < currentPrice) {
            // Drop more aggressively (20% extra)
            double diff = currentPrice - newBid;
            return currentPrice - diff - (0.2 * diff);
        } else {
            // If newBid is higher, keep it subdued
            double diff = newBid - currentPrice;
            return currentPrice + (0.3 * diff);
        }
    }

    @Override
    public int computeMetric(StockAPI stock, double newBid) {
        // In a bear scenario, difference is scaled differently
        double diff = newBid - stock.getPrice();
        return (int) (diff * 1.5);
    }
}
