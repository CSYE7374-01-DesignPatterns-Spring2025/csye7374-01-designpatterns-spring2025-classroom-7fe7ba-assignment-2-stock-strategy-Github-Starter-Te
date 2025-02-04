package edu.neu.csye7374;

public class AdobeStock extends StockAPI {
    private StockPriceStrategy strategy;

    // Default constructor with a default Bull strategy
    public AdobeStock(String id, String name, Double price, String description) {
        super(id, name, price, description);
        this.strategy = new AdobeBullStrategy();
    }

    // Optional: constructor that accepts a strategy explicitly
    public AdobeStock(String id, String name, Double price, String description, StockPriceStrategy strategy) {
        super(id, name, price, description);
        this.strategy = strategy;
    }

    public void setStrategy(StockPriceStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void setBid(String bid) {
        double newBid = Double.parseDouble(bid);
        // Delegate to strategy
        double newPrice = strategy.computePrice(this, newBid);
        int newMetric = strategy.computeMetric(this, newBid);

        // Update fields
        setPrice(newPrice);
        setMetric(newMetric);
    }
}
