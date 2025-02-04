package edu.neu.csye7374;

public class BearMarketStrategy implements MarketStrategy {

    @Override
    public void tradeStock(StockAPI stock) {
        Double price = stock.getPrice();
        price -= price * 0.4; // 40% decrease in price for bear market since stocks are falling
        stock.setPrice(price);
    }
    
}
