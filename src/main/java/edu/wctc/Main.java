package edu.wctc;
import edu.wctc.iface.Sale;
import edu.wctc.iface.ShippingPolicy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SalesReportConfig.class);

        ShippingPolicy shippingPolicy = context.getBean(ShippingPolicy.class);
        SalesReportService salesReportService = context.getBean(SalesReportService.class);

        // Create a list of Sale objects
        List<Sales> sales = new ArrayList<>();
        
        sales.add(new Sales("Stacy Read","United States",190.95,10.45, 0.0));
        sales.add(new Sales("R.B. Whitaker","United States",54.33,4.35,0.0));
        sales.add(new Sales("Rabindranath Tagore","India",117.89,11.20,0.0));
        sales.add(new Sales("Lindsay Ellis","United States",25.19,1.51,0.0));
        sales.add(new Sales( "Shin Takahashi","Japan",145.00,10.88,0.0));
        sales.add(new Sales("Erich Gamma","United States",53.63,3.50,0.0));
        sales.add(new Sales("Iain M. Banks","Scotland",75.42,6.71,0.0));
        sales.add(new Sales("Meg Ray","United States",11.99,1.05, 0.0));


        // Use the SalesReportService with the configured ShippingPolicy
        salesReportService.calculateTotalShipping(sales);

    }

}
