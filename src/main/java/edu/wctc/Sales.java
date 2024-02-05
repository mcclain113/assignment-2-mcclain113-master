package edu.wctc;

import edu.wctc.iface.Sale;

import java.util.ArrayList;
import java.util.List;

public class Sales implements edu.wctc.iface.Sale {
    String name = null;
    String country = null;
    Double price =0.0;
    Double tax =0.0;
    Double shipping =0.0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getShipping() {
        return shipping;
    }

    public void setShipping(Double shipping) {
        this.shipping = shipping;
    }


    public Sales(String name, String country, Double price, Double tax, Double shipping  ) {
        this.name = name;
        this.country = country;
        this.price = price;
        this.tax = tax;
        this.shipping = shipping;
    }

    @Override
    public String toString() {
        return String.format("%20s %20s %,10.2f %,10.2f %,10.2f", name, country, price, tax, shipping);
    }

}
