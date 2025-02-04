package edu.neu.csye7374;

public class AdobeBullStrategy implements StockPriceStrategy {

    @Override
    public double computePrice(StockAPI stock, double newBid) {
        double currentPrice = stock.getPrice();
        // In a bull market, Adobe stock might rise more aggressively
        if (newBid > currentPrice) {
            double diff = newBid - currentPrice;
            // Increase by the difference + 10% extra
            return currentPrice + diff + (0.1 * diff);
        } else {
            // If bid is below currentPrice, reduce less drastically
            double diff = currentPrice - newBid;
            return currentPrice - (0.05 * diff);
        }
    }

    @Override
    public int computeMetric(StockAPI stock, double newBid) {
        // metric: difference * 2
        // (positive if newBid > currentPrice, negative if newBid < currentPrice)
        double diff = newBid - stock.getPrice();
        return (int) (diff * 2);
    }
}
