package edu.neu.csye7374;

public class BullMarketStrategy implements MarketStrategyAPI {
    @Override
    public void tradeStock(Stock stock) {
        Double price = stock.getPrice();
        price += price * 0.4; // 40% increase in price for bull market since stocks are rising
        stock.setPrice(price);
    }
    
}
