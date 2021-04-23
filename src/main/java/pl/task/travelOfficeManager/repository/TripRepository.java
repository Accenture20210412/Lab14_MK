package pl.task.travelOfficeManager.repository;


import org.springframework.stereotype.Repository;
import pl.task.travelOfficeManager.model.Trip;
import pl.task.travelOfficeManager.repository.boundary.ITripRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class TripRepository implements ITripRepository {

    private List<Trip> listOfTrip = new ArrayList<>();




    @Override
    public List<Trip> getListOfTrip() {


        return listOfTrip;
    }


    @Override
    public boolean addTrip(Trip trip) {
        for (Trip tripExample : listOfTrip) {
            if (tripExample.getName().equals(trip.getName())) {
                return false;
            }
        }
        listOfTrip.add(trip);
        return true;
    }

    @Override
    public boolean searchTripByName(String nameOfTrip) {
        List<Trip> listWithName = listOfTrip.stream()
                .filter(name -> name.getName().equals(nameOfTrip))
                .collect(Collectors.toList());
        return !listWithName.isEmpty();
    }

    @Override
    public List<Trip> searchTripStartAfterDate(LocalDate date) {
        return listOfTrip.stream()
                .filter(d -> d.getDateStart().isAfter(date))
                .collect(Collectors.toList());
    }

    @Override
    public List<Trip> searchTripByDirection(String direction) {
        return listOfTrip.stream()
                .filter(d -> d.getLocationDirection().contains(direction))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteTrip(String nameOfTrip) {
        listOfTrip = listOfTrip.stream()
                .filter(c-> !c.getName().equals(nameOfTrip))
                .collect(Collectors.toList());
    }
}
