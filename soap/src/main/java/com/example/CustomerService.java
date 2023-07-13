package com.example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public class CustomerService {

    @WebMethod
    public String saveCustomer(String name, String dob, String phoneNumber, String email) {
        // Implement code to save customer details to a file
        // Return an acknowledgement SOAP response
        return "Customer details saved successfully!";
    }

    @WebMethod
    public String getCustomerDetails(String email, String phoneNumber) {
        // Implement code to retrieve dummy customer details
        // Return the dummy customer details in the SOAP response
        return "Dummy customer details";
    }
}
