package edu.neu.csye7374;

public class AppleStock extends StockAPI {
    public AppleStock(String id, String name, Double price, String description, int metric) {
        super(id, name, price, description, metric);
    }
    
    @Override
    public void setBid(String bid) {
        Double currPrice = this.getPrice();
        Double currBid = Double.parseDouble(bid);
        setMetric((int) ((currBid - currPrice) * 3)); // Metric calculation simply deduct the bid from the price and multiply by 3
        if(currBid < currPrice)
            setPrice(currPrice - currBid * 0.2); // If bid is less than price, reduce the price by 20% of the bid
        else
            setPrice(currPrice + currBid * 0.2); // If bid is more than price, increase the price by 20% of the bid
    }
}
