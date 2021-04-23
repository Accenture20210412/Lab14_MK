package pl.task.travelOfficeManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.task.travelOfficeManager.model.Trip;
import pl.task.travelOfficeManager.repository.boundary.ITripRepository;

import java.time.LocalDate;
import java.util.List;

@RestController

@RequestMapping("/trips")
public class TripController {

    @Autowired
    private ITripRepository tripRepository;


    @GetMapping
    public List<Trip> getListOfTrip() {
        return tripRepository.getListOfTrip();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addTrip(@RequestBody Trip trip) {
        return tripRepository.addTrip(trip);
    }


    @GetMapping(params = "nameOfTrip")
    public boolean searchTripByName(@RequestParam(name = "nameOfTrip")  String nameOfTrip) {
        return tripRepository.searchTripByName(nameOfTrip);
    }

    @ResponseBody
    @GetMapping(params = "date")
    public List<Trip> searchTripStartAfterDate(@RequestParam(name = "date")  LocalDate date) {
        return tripRepository.searchTripStartAfterDate(date);
    }

    @ResponseBody
    @GetMapping(params = "direction")
    public List<Trip> searchTripByDirection(@RequestParam(name = "direction") String direction) {
        return tripRepository.searchTripByDirection(direction);
    }

}
