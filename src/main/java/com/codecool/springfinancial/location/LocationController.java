package com.codecool.springfinancial.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class LocationController {

    private final LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/locations")
    public List<Location> allAccess() {
        return locationService.getLocations();
    }
}
//    public List<Location> getLocations() {
//        return locationService.getLocations();
//    }

//    @CrossOrigin(origins = "http://localhost:8081")
//    @GetMapping("/api/location/{id}")
//    public Optional<Location> getLocationById(@PathVariable("id") Long id, @RequestParam(required = false) String name, @RequestParam(required = false) String address) {
//        return locationService.getLocationById(id);
//    }

