package learning.personal.cdc.demo.controller;

import learning.personal.cdc.demo.models.CustomerResponse;
import learning.personal.cdc.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/customer/{customerId}")
    public CustomerResponse getCustomer(@PathVariable(value = "customerId") String customerId) {
        return customerService.getCustomer(customerId);
    }

}
