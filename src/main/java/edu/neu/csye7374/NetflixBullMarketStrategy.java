package edu.neu.csye7374;

public class NetflixBullMarketStrategy implements StockPriceStrategy {

    @Override
    public double computePrice(StockAPI stock, double newPrice) {
        double currentPrice = stock.getPrice();
        // In a bull market, if newPrice > currentPrice,
        // the actual updated price might jump extra.
        if (newPrice > currentPrice) {
            double diff = newPrice - currentPrice;
            return currentPrice + diff + (0.1 * diff);
        } else {
            // If price is going down in a bull market, soften the drop
            double diff = currentPrice - newPrice;
            return currentPrice - (diff * 0.5);
        }
    }
}
