package pl.task.travelOfficeManager.repository.boundary;

import pl.task.travelOfficeManager.model.Trip;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface ITripRepository {
    List<Trip> getListOfTrip();

    boolean addTrip(Trip trip);

    boolean searchTripByName(String nameOfTrip);

    List<Trip> searchTripStartAfterDate(LocalDate date);

    List<Trip> searchTripByDirection(String direction);

    void deleteTrip(String nameOfTrip);

}
