package edu.neu.csye7374;

public class StockAPI implements Tradable {
    private String id;
    private String name;
    private Double price;
    private String description;
    private int metric;

    public StockAPI() {

    }

    public StockAPI(String id, String name, Double price, String description, int metric) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.metric = metric;
    }

    // Getters and Setters
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
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setMetric(int metric) {
        this.metric = metric;
    }

    @Override
    public void setBid(String bid) {
        this.setPrice(Double.parseDouble(bid));
    }

    @Override
    public int getMetric() {
        return this.metric;
    }   

    @Override 
    public String toString() {
        return "StockAPI [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
                + ", metric=" + metric + "]";
    }
}
