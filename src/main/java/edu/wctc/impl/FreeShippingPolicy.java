package edu.wctc.impl;

import edu.wctc.Sales;
import edu.wctc.iface.Sale;
import edu.wctc.iface.ShippingPolicy;

import java.util.List;

public class FreeShippingPolicy implements ShippingPolicy {
    @Override
    public double calculateShippingAmount(Sales sale) {
        // Implementation for free shipping
        return 0.0;
    }
}