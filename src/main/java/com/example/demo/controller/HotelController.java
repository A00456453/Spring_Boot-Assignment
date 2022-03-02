package com.example.demo.controller;

import com.example.demo.model.HotelModel;
import com.example.demo.service.HotelService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("/hotels")
    public ResponseEntity<List<Object>> getHotels() {
        return new ResponseEntity(hotelService.getHotels(), HttpStatus.OK);
    }

    @PostMapping("/hotel")
    public ResponseEntity<Void> saveHotel(@RequestBody HotelModel hotel) {
        hotelService.saveHotel(hotel);
        return new ResponseEntity(HttpStatus.OK);
    }

}
