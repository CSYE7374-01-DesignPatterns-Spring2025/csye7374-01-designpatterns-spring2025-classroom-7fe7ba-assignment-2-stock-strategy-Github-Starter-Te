package edu.neu.csye7374;

public class AppleBearStrategy implements StockPriceStrategy {

    @Override
    public double computePrice(StockAPI stock, double newBid) {
        double currentPrice = stock.getPrice();
        // Apple bear logic: might drop aggressively or rise minimally
        if (newBid < currentPrice) {
            double diff = currentPrice - newBid;
            // Substantial drop
            return currentPrice - diff - (0.2 * diff);
        } else {
            // If it's higher, hamper the increase
            double diff = newBid - currentPrice;
            return currentPrice + (0.2 * diff);
        }
    }

    @Override
    public int computeMetric(StockAPI stock, double newBid) {
        // Simpler scaling in a bear scenario
        double diff = newBid - stock.getPrice();
        return (int) (diff * 1);
    }
}
