package edu.neu.csye7374;

public class AppleStock extends StockAPI {
    private StockPriceStrategy strategy;

    // Default constructor with a default Bull strategy
    public AppleStock(String id, String name, Double price, String description) {
        super(id, name, price, description);
        this.strategy = new AppleBullStrategy();
    }

    // Optional: constructor with specified strategy
    public AppleStock(String id, String name, Double price, String description, StockPriceStrategy strategy) {
        super(id, name, price, description);
        this.strategy = strategy;
    }

    public void setStrategy(StockPriceStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void setBid(String bid) {
        double newBid = Double.parseDouble(bid);
        // Use the strategy to compute final price and metric
        double newPrice = strategy.computePrice(this, newBid);
        int newMetric = strategy.computeMetric(this, newBid);

        // Update fields
        setPrice(newPrice);
        setMetric(newMetric);
    }
}
