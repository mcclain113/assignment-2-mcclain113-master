package edu.wctc;

import edu.wctc.iface.Sale;
import edu.wctc.iface.ShippingPolicy;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesReportService {

    private final ShippingPolicy shippingPolicy;

    public SalesReportService(ShippingPolicy shippingPolicy) {
        this.shippingPolicy = shippingPolicy;
    }

    // Other methods for reading sales data and producing reports

    public void calculateTotalShipping(List<Sales> sales) {

        for (Sales sale : sales) {
            double shipping = 0.0;
            shipping += shippingPolicy.calculateShippingAmount(sale);
            sale.setShipping(shipping);
        }
        printTable(sales);
    }

        private static void printTable(List<Sales> sales) {
                // Print table header
                System.out.printf("%20s %20s %10s %10s %10s", "Name", "Country", "Price", "Tax", "Shipping");
            System.out.println();
                // Print table rows
                for (Sales sale : sales) {
                    System.out.println(sale);
                }
        }
        }


