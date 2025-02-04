package edu.neu.csye7374;

public class CalculateMetrics {
    private static CalculateMetrics instance = null;

    private CalculateMetrics() {
    }

    // Lazy singleton class instance
    public static CalculateMetrics getInstance() {
        if (instance == null) {
            synchronized (CalculateMetrics.class) {
                if (instance == null) {
                    instance = new CalculateMetrics();
                }
            }
        }
        return instance;
    }

    public void calculateMetrics() {
        System.out.println("\n=== Calculate Metrics Demonstration (Strategy Pattern) ===\n");

        // 1) AdobeStock initially with AdobeBullStrategy
        AdobeStock adobeStock = new AdobeStock("ADB", "Adobe", 131.5, "Adobe Stock", new AdobeBullStrategy());
        System.out.println("Initial: " + adobeStock);

        // Make some bids with the Bull strategy
        adobeStock.setBid("138");
        System.out.println("\nAfter bid 138 (Bull Strategy):");
        System.out.println(adobeStock.getName() + " price: " + adobeStock.getPrice());
        System.out.println(adobeStock.getName() + " metric: " + adobeStock.getMetric());

        // Switch Adobe to Bear Market Strategy
        adobeStock.setStrategy(new AdobeBearStrategy());
        System.out.println("\nSwitched " + adobeStock.getName() + " to Bear Strategy");

        adobeStock.setBid("100");
        System.out.println("\nAfter bid 100 (Bear Strategy):");
        System.out.println(adobeStock.getName() + " price: " + adobeStock.getPrice());
        System.out.println(adobeStock.getName() + " metric: " + adobeStock.getMetric());

        adobeStock.setBid("120");
        System.out.println("\nAfter bid 120 (Bear Strategy):");
        System.out.println(adobeStock.getName() + " price: " + adobeStock.getPrice());
        System.out.println(adobeStock.getName() + " metric: " + adobeStock.getMetric());


        System.out.println("\n----------------***** Apple Stock *****----------------\n");

        // 2) AppleStock initially with AppleBearStrategy
        AppleStock appleStock = new AppleStock("AAPL", "Apple", 190.5, "Apple Stock", new AppleBearStrategy());
        System.out.println("Initial: " + appleStock);

        appleStock.setBid("200");
        System.out.println("\nAfter bid 200 (Bear Strategy):");
        System.out.println(appleStock.getName() + " price: " + appleStock.getPrice());
        System.out.println(appleStock.getName() + " metric: " + appleStock.getMetric());

        // Switch Apple to Bull Strategy
        appleStock.setStrategy(new AppleBullStrategy());
        System.out.println("\nSwitched " + appleStock.getName() + " to Bull Strategy");

        appleStock.setBid("220");
        System.out.println("\nAfter bid 220 (Bull Strategy):");
        System.out.println(appleStock.getName() + " price: " + appleStock.getPrice());
        System.out.println(appleStock.getName() + " metric: " + appleStock.getMetric());

        appleStock.setBid("160");
        System.out.println("\nAfter bid 160 (Bull Strategy):");
        System.out.println(appleStock.getName() + " price: " + appleStock.getPrice());
        System.out.println(appleStock.getName() + " metric: " + appleStock.getMetric());
    }
}
