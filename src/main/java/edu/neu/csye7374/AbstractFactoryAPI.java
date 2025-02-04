package edu.neu.csye7374;

public interface AbstractFactoryAPI {
    public Stock createStock(String id, String name, Double price, String description, int metric);
}
