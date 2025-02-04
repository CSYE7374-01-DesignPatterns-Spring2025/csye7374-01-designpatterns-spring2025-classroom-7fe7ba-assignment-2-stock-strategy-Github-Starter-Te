package edu.neu.csye7374;

public interface AbstractFactory {
    public StockAPI createStock(String id, String name, Double price, String description, int metric);
}
