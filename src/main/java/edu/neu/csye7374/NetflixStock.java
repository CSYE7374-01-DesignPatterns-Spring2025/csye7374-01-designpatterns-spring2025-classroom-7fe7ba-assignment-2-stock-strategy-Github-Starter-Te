package edu.neu.csye7374;

public class NetflixStock extends StockAPI {

    private StockPriceStrategy strategy;

    public NetflixStock(String name, double price, String description, StockPriceStrategy strategy) {
        super(name, price, description);
        this.strategy = strategy;
    }

    // Allow changing strategy at runtime
    public void setStrategy(StockPriceStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void setPrice(double newPrice) {
        // Delegate price calculation to the strategy
        double updatedPrice = strategy.computePrice(this, newPrice);

        // Update metrics
        if (updatedPrice > this.getPrice()) {
            setMetric(getMetric() + 5); // just an example
        } else {
            setMetric(getMetric() - 2);
        }

        // Update the actual price
        super.setPrice(updatedPrice);
    }
}
