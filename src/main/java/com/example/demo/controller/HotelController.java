package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.HotelService;
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
    public ResponseEntity<HotelList> getHotels() {
        return new ResponseEntity(hotelService.getHotels(), HttpStatus.OK);
    }

    @PostMapping("/hotel")
    public ResponseEntity<Void> saveHotel(@RequestBody HotelModel hotel) {
        hotelService.saveHotel(hotel);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/reservation")
    public ResponseEntity<ConfirmReservationResponse> confirmReservation(@RequestBody ConfirmReservationRequest confirmReservationRequest) {
        return new ResponseEntity(hotelService.confirmReservation(confirmReservationRequest), HttpStatus.OK);
    }
}
