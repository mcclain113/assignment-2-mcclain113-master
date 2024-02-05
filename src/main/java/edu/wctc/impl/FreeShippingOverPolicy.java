package edu.wctc.impl;

import edu.wctc.Sales;
import edu.wctc.iface.Sale;
import edu.wctc.iface.ShippingPolicy;

import java.util.List;

public class FreeShippingOverPolicy implements ShippingPolicy {
    @Override
    public double calculateShippingAmount(Sales sale) {
        // Implementation for flat-rate OVER $50 shipping
        double total = sale.getTax() + sale.getPrice();
        if (total > 50.0) {
            return 0.0;
        }
        else
        {return 5.0;}
    }


}