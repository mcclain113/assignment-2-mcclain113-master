package edu.wctc;

import edu.wctc.iface.ShippingPolicy;
import edu.wctc.impl.FlatRateShippingPolicy;
import edu.wctc.impl.FreeShippingOverPolicy;
import edu.wctc.impl.FreeShippingPolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalesReportConfig {

//    @Bean
//    public ShippingPolicy freeShippingPolicy() {
//        return new FreeShippingPolicy();
//    }

//    @Bean
//    public ShippingPolicy flatRateShippingPolicy() {
//        return new FlatRateShippingPolicy();
//    }
//
    @Bean
    public ShippingPolicy freeShippingOverPolicy() {
        return new FreeShippingOverPolicy();
    }

    @Bean
    public SalesReportService salesReportService(ShippingPolicy shippingPolicy) {
        return new SalesReportService(shippingPolicy);
    }
}