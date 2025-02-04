package edu.neu.csye7374;

public class AdobeStock extends StockAPI {
    public AdobeStock(String id, String name, Double price, String description) {
        super(id, name, price, description);
    }

    @Override
    public void setBid(String bid) {
        Double currPrice = this.getPrice();
        Double currBid = Double.parseDouble(bid);
        setMetric((int) ((currBid - currPrice) * 2)); // Metric calculation simply deduct the bid from the price and multiply by 2
        if(currBid < currPrice)
            setPrice(currPrice - currBid * 0.1); // If bid is less than price, reduce the price by 10% of the bid
        else
            setPrice(currPrice + currBid * 0.1); // If bid is more than price, increase the price by 10% of the bid
    }
}
