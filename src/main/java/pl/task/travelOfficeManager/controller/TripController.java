package pl.task.travelOfficeManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.task.travelOfficeManager.repository.boundary.ITripRepository;

@RestController

@RequestMapping("/customer")
public class TripController {

    @Autowired
    private ITripRepository tripRepository;
}
