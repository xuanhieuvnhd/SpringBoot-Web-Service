package com.controller;

import com.model.Location;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class HomeController {
    @GetMapping("/weather/{userName}/{passWord}")
    public ResponseEntity<Location> getWeather(@PathVariable String userName, @PathVariable String passWord) {
        return new ResponseEntity<Location>(new Location(1, "Vietnam", 27.4f, "Sun"), HttpStatus.OK);
    }
}
