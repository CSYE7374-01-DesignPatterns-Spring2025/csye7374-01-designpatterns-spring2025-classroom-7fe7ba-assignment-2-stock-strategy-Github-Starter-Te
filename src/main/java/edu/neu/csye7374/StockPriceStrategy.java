package edu.neu.csye7374;

public interface StockPriceStrategy {
    /**
     * Computes the new price based on the current price, incoming bid,
     * and the particular strategy (Bull/Bear).
     */
    double computePrice(StockAPI stock, double newBid);

    /**
     * Computes the new metric based on the current price, incoming bid,
     * and the particular strategy (Bull/Bear).
     */
    int computeMetric(StockAPI stock, double newBid);
}
