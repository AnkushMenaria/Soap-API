package com.example;

import com.example.CustomerService;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Application {
    public static void main(String[] args) {
        // Create and publish the SOAP service
        CustomerService customerService = new CustomerService();
        String address = "http://localhost:8080/soap";
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(CustomerService.class);
        factory.setAddress(address);
        factory.setServiceBean(customerService);
        factory.create();
        System.out.println("SOAP server started at: " + address);
    }
}
