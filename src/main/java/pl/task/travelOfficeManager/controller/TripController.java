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


    @GetMapping("/{name}")
    public boolean searchTripByName(@PathVariable String nameOfTrip) {
        return tripRepository.searchTripByName(nameOfTrip);
    }

    @ResponseBody
    @GetMapping("/{date}")
    public List<Trip> searchTripStartAfterDate(@PathVariable LocalDate date) {
        return tripRepository.searchTripStartAfterDate(date);
    }

    @ResponseBody
    @GetMapping("/{direction}")
    public List<Trip> searchTripByDirection(@PathVariable String direction) {
        return tripRepository.searchTripByDirection(direction);
    }

}
