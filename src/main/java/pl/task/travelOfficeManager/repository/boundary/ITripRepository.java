package pl.task.travelOfficeManager.repository.boundary;

import pl.task.travelOfficeManager.model.Trip;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface ITripRepository {
    public List<Trip> getListOfTrip();
    public boolean addTrip(Trip trip);
    public boolean searchTripByName(String nameOfTrip);
    public List<Trip> searchTripStartAfterDate(LocalDate date);
    public List<Trip> searchTripByDirection(String direction);

}
