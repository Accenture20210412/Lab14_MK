package pl.task.travelOfficeManager.repository.boundary;

import pl.task.travelOfficeManager.model.Customer;

import java.util.List;

public interface ICustomerRepository {

    public void addCustomer(Customer customer);
    public void deleteCustomer(String partOfNameOrSurname);
    public List<Customer> getListOfCustomer();
}
