package edu.neu.csye7374;

public interface StockPriceStrategy {
    double computePrice(StockAPI stock, double newPrice);
}
