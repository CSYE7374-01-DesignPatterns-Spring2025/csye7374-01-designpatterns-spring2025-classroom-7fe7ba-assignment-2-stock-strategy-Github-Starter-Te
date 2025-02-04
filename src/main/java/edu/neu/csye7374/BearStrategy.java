package edu.neu.csye7374;

import java.util.Collections;
import java.util.List;

public class BearStrategy implements MarketStrategy {
    @Override
    public double calculatePrice(Double bids) {
        double bMux = 0.95 * bids; 

        return bMux;
    }
}