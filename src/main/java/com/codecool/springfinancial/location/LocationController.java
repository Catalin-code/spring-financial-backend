package com.codecool.springfinancial.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LocationController {
    private final LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(path = "api/location")
    public List<Location> getLocations() {
        return locationService.getLocations();
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/api/location/{id}")
    public Optional<Location> getLocationById(@PathVariable("id") Long id, @RequestParam(required = false) String name, @RequestParam(required = false) String address) {
        return locationService.getLocationById(id);
    }
}
