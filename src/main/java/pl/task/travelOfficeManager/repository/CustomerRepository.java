package pl.task.travelOfficeManager.repository;

import lombok.Getter;
import org.springframework.stereotype.Repository;
import pl.task.travelOfficeManager.model.Customer;
import pl.task.travelOfficeManager.repository.boundary.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

@Getter
@Repository
public class CustomerRepository implements ICustomerRepository {

    private List<Customer> listOfCustomer = new ArrayList<>();


    @Override
    public void addCustomer(Customer customer) {
        listOfCustomer.add(customer);
    }

    @Override
    public void deleteCustomer(String partOfNameOrSurname) {
        listOfCustomer.removeIf(partString -> partString.getName().contains(partOfNameOrSurname));
        listOfCustomer.removeIf(partString -> partString.getSurname().contains(partOfNameOrSurname));
    }

    @Override
    public List<Customer> getListOfCustomer() {
        return listOfCustomer;
    }
}
