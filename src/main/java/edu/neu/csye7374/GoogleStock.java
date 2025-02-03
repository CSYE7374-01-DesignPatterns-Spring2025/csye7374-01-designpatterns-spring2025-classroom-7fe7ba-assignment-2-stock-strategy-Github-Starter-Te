package edu.neu.csye7374;

public class GoogleStock extends StockAPI {

    private StockPriceStrategy strategy;

    public GoogleStock(String name, double price, String description, StockPriceStrategy strategy) {
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

        // Update metrics as desired
        if (updatedPrice > this.getPrice()) {
            setMetric(getMetric() + 3); // just an example
        } else {
            setMetric(getMetric() - 1);
        }

        // Update the actual price
        super.setPrice(updatedPrice);
    }
}
