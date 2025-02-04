package edu.neu.csye7374;

public class AppleBullStrategy implements StockPriceStrategy {

    @Override
    public double computePrice(StockAPI stock, double newBid) {
        double currentPrice = stock.getPrice();
        // Apple bullish logic: rises more aggressively
        if (newBid > currentPrice) {
            double diff = newBid - currentPrice;
            // Additional 20% on top of the difference
            return currentPrice + diff + (0.2 * diff);
        } else {
            // If newBid is less, reduce price slightly
            double diff = currentPrice - newBid;
            return currentPrice - (0.1 * diff);
        }
    }

    @Override
    public int computeMetric(StockAPI stock, double newBid) {
        // Apple bullish metric weighs differences heavily
        double diff = newBid - stock.getPrice();
        return (int) (diff * 3);
    }
}
