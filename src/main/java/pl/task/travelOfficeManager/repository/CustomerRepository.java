package pl.task.travelOfficeManager.repository;

import lombok.Getter;
import org.springframework.stereotype.Repository;
import pl.task.travelOfficeManager.model.Customer;
import pl.task.travelOfficeManager.repository.boundary.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Repository
public class CustomerRepository implements ICustomerRepository {

    private List<Customer> listOfCustomer = new ArrayList<>();


    @Override
    public void addCustomer(Customer customer) {
        listOfCustomer.add(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        listOfCustomer = listOfCustomer.stream()
                .filter(c-> c.getIdCustomer() != id)
                .collect(Collectors.toList());

    }

    @Override
    public List<Customer> getListOfCustomer() {
        return listOfCustomer;
    }
}
