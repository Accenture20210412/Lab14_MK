package pl.task.travelOfficeManager.repository;

import org.springframework.stereotype.Repository;
import pl.task.travelOfficeManager.model.Customer;
import pl.task.travelOfficeManager.repository.boundary.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository implements ICustomerRepository {

    private  List<Customer> listOfCustomer = new ArrayList<>();


}
