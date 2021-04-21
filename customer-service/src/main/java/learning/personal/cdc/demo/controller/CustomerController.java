package learning.personal.cdc.demo.controller;

import learning.personal.cdc.demo.models.CustomerRequest;
import learning.personal.cdc.demo.models.CustomerResponse;
import learning.personal.cdc.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/customer/{customerId}")
    public CustomerResponse getCustomer(@PathVariable(value = "customerId") String customerId) {
        return customerService.getCustomer(customerId);
    }


    @PostMapping(value = "/customer",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HttpStatus> saveCustomer(@RequestBody CustomerRequest customerRequest) {
         customerService.saveCustomer(customerRequest);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
