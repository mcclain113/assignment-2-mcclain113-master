package edu.wctc.impl;

import edu.wctc.Sales;
import edu.wctc.iface.Sale;
import edu.wctc.iface.ShippingPolicy;

import java.util.List;

public class FlatRateShippingPolicy implements ShippingPolicy {

    @Override
    public double calculateShippingAmount(Sales sale) {
        return 5.0;
    }
}