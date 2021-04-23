package pl.task.travelOfficeManager.repository;


import org.springframework.stereotype.Repository;
import pl.task.travelOfficeManager.model.Trip;
import pl.task.travelOfficeManager.repository.boundary.ITripRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TripRepository implements ITripRepository {

    private List<Trip> listOfTrip = new ArrayList<>();
}
