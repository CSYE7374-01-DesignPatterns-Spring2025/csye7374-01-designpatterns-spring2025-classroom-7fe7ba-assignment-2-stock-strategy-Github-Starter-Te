package edu.neu.csye7374;

public interface AbstractFactory {
    StockAPI createStock(String id, String name, Double price, String description);
}
