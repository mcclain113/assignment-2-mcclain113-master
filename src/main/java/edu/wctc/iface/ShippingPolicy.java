package edu.wctc.iface;

import edu.wctc.Sales;

import java.util.List;

public interface ShippingPolicy {
    double calculateShippingAmount(Sales sale);
}
