package edu.neu.csye7374;

import java.util.Collection;
import java.util.List;

public class StockAPI implements Tradable {
    private String id;
    private String name;
    private Double price;
    private String Description;
    private int metric;
    private MarketStrategy marketStrategy;
    private List<Double> bids;

    
    public StockAPI(String id, String name, Double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        Description = description;
    }

    public StockAPI() {

    }

    // Getters and Setters

    public void setMetric(int metric) {
        this.metric = metric;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setStrategy(MarketStrategy marketStrategy){
        this.marketStrategy = marketStrategy;
    }

    public MarketStrategy getMarketStrategy(){
        return this.marketStrategy;
    }
    
    // toString method
    @Override
    public String toString() {
        return "StockAPI [Description=" + Description + ", id=" + id + ", name=" + name + ", price=" + price + ", metric=" + metric +"]";
    }


    @Override
    public void setBid(String bid) {
        this.setPrice(Double.parseDouble(bid));
    }

    @Override
    public int getMetric() {
        return this.metric;
    }

}
