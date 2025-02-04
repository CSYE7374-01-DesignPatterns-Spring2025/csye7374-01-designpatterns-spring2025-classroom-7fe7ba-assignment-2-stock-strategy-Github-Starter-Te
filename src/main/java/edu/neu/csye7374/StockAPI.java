package edu.neu.csye7374;

public class StockAPI implements Tradable {
    private String id;
    private String name;
    private Double price;
    private String Description;
    private int metric;

    public StockAPI(String id, String name, Double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.Description = description;
    }

    public StockAPI() {
        // Default constructor
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
        return Description;
    }
    public void setDescription(String description) {
        this.Description = description;
    }

    public void setMetric(int metric) {
        this.metric = metric;
    }

    @Override
    public int getMetric() {
        return this.metric;
    }

    // By default, setting a bid just sets the price.
    // Derived classes can override or use a strategy to do advanced logic.
    @Override
    public void setBid(String bid) {
        this.setPrice(Double.parseDouble(bid));
    }

    @Override
    public String toString() {
        return "StockAPI [Description=" + Description + ", id=" + id
                + ", name=" + name + ", price=" + price + ", metric=" + metric + "]";
    }
}
