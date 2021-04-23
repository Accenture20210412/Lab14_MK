package pl.task.travelOfficeManager.model;

import pl.task.travelOfficeManager.model.Customer;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TravelOffice {

    private List<Customer> listOfCustomer;
    Set<Trip> setOfTrip;

    public TravelOffice() {
        listOfCustomer = new ArrayList<>();
    }


    public void addCustomer(Customer customer) {
        listOfCustomer.add(customer);
    }

    public void deleteCustomer(String partOfNameOrSurname) {
        listOfCustomer.removeIf(partString -> partString.getName().contains(partOfNameOrSurname));
        listOfCustomer.removeIf(partString -> partString.getSurname().contains(partOfNameOrSurname));
    }

    public List<Customer> getListOfCustomer() {
        return listOfCustomer;
    }

    public Set<Trip> getSetOfTrip() {
        return setOfTrip;
    }


    public void setTripToIndividualCustomer(Trip trip, int idCustomer) {
     listOfCustomer.stream()
                .filter(d -> d.getIdCustomer() == idCustomer)
                .forEach(e->e.setTripCustomer(trip));

    }

    public boolean addTrip(Trip trip) {
        for(Trip tripExample : setOfTrip) {
            if(tripExample.getName().equals(trip.getName())) {
                return false;
            }
        }
        setOfTrip.add(trip);
        return true;

    }

    public boolean searchTripByName(String nameOfTrip) {
        Set<Trip> setWithName = setOfTrip.stream()
                .filter(name -> name.getName().equals(nameOfTrip))
                .collect(Collectors.toSet());
        return !setWithName.isEmpty();
    }

    public Set<Trip> searchTripStartAfterDate(LocalDate date) {
       return setOfTrip.stream()
                .filter(d->d.getDateStart().isAfter(date))
                .collect(Collectors.toSet());


    }

    public Set<Trip> searchTripByDirection(String direction){
       return setOfTrip.stream()
                .filter(d->d.getLocationDirection().contains(direction))
                .collect(Collectors.toSet());

    }



    public String getCustomerInfo() {
        System.out.println("Lenght of array" + listOfCustomer.size());
        return listOfCustomer.toString();
    }
}