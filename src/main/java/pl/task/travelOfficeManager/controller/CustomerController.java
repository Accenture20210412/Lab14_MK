package pl.task.travelOfficeManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.task.travelOfficeManager.repository.boundary.ICustomerRepository;

@RestController

@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerRepository customerRepository;



}
