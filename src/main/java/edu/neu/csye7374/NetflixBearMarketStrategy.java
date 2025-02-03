package edu.neu.csye7374;

public class NetflixBearMarketStrategy implements StockPriceStrategy {

    @Override
    public double computePrice(StockAPI stock, double newPrice) {
        double currentPrice = stock.getPrice();
        // In a bear market, if newPrice < currentPrice,
        // the price might drop more aggressively.
        if (newPrice < currentPrice) {
            double diff = currentPrice - newPrice;
            return currentPrice - diff - (0.1 * diff);
        } else {
            double diff = newPrice - currentPrice;
            return currentPrice + (diff * 0.1);
        }
    }
}
