package edu.neu.csye7374;

import java.util.Collections;
import java.util.List;

public class BullStrategy implements MarketStrategy {
    @Override
    public double calculatePrice(Double bids) {
        double bMux = 1.05 * bids; 

        return bMux;
    }
}