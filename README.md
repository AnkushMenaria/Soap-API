# SOAP API Server Application

This server application is built to handle SOAP requests and responses. It provides two main functionalities: saving customer information and retrieving dummy customer details. The SOAP API can be tested using SoapUI.

## Prerequisites

Before getting started, make sure you have the following installed:

- Java Development Kit (JDK)
- Apache Maven
- SoapUI

## Getting Started

1. Clone the repository:

```bash
git clone https://github.com/your-username/soap-api-server.git
Change to the project directory:
bash
Copy code
cd soap-api-server
Build the application using Maven:
bash
Copy code
mvn clean install
Run the application:
bash
Copy code
java -jar target/soap-api-server.jar
API Endpoints
Save Customer Request
This endpoint receives a SOAP request containing customer details and saves the data in a file. It returns a SOAP acknowledgement response.

Request Payload:
Customer Name
Date of Birth (DOB)
Phone Number
Email
Example SOAP Request:

xml
Copy code
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://example.com/soap-api-server">
   <soapenv:Header/>
   <soapenv:Body>
      <ser:SaveCustomerRequest>
         <ser:customer>
            <ser:name>John Doe</ser:name>
            <ser:dob>1990-01-01</ser:dob>
            <ser:phone>1234567890</ser:phone>
            <ser:email>john.doe@example.com</ser:email>
         </ser:customer>
      </ser:SaveCustomerRequest>
   </soapenv:Body>
</soapenv:Envelope>
Get Customer Details Request
This endpoint receives a SOAP request containing a customer's email and phone number. It returns a SOAP response with dummy customer details.

Request Payload:
Email
Phone Number
Example SOAP Request:

xml
Copy code
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://example.com/soap-api-server">
   <soapenv:Header/>
   <soapenv:Body>
      <ser:GetCustomerDetailsRequest>
         <ser:email>john.doe@example.com</ser:email>
         <ser:phone>1234567890</ser:phone>
      </ser:GetCustomerDetailsRequest>
   </soapenv:Body>
</soapenv:Envelope>
That's it! You can use SoapUI to send these SOAP requests to the API endpoints and verify the responses.

css
Copy code

Please note that you may need to adjust the XML namespaces and endpoint URLs acco
