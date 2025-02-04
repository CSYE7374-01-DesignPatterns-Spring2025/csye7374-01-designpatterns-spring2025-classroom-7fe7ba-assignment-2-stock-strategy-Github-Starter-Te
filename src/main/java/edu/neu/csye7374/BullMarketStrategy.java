package edu.neu.csye7374;

public class BullMarketStrategy implements MarketStrategy {
    @Override
    public void tradeStock(StockAPI stock) {
        Double price = stock.getPrice();
        price += price * 0.4; // 40% increase in price for bull market since stocks are rising
        stock.setPrice(price);
    }
    
}
