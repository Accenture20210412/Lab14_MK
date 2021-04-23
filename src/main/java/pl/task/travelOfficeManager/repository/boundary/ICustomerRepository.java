package pl.task.travelOfficeManager.repository.boundary;

import pl.task.travelOfficeManager.model.Customer;

import java.util.List;

public interface ICustomerRepository {

    void addCustomer(Customer customer);

    void deleteCustomer(int idCustomer);

    List<Customer> getListOfCustomer();
}
