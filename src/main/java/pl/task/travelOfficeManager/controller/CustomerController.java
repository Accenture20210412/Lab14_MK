package pl.task.travelOfficeManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.task.travelOfficeManager.model.Customer;
import pl.task.travelOfficeManager.repository.boundary.ICustomerRepository;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerRepository customerRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCustomer(@RequestBody Customer customer){
        customerRepository.addCustomer(customer);
    }

    @DeleteMapping (params = "idCustomer")
    public void deleteCustomer(@RequestParam(name = "idCustomer")  Integer idCustomer){
        customerRepository.deleteCustomer(idCustomer);
    }

    @ResponseBody
    @GetMapping
    public List<Customer> getListOfCustomer(){
        return customerRepository.getListOfCustomer();
    }
}
