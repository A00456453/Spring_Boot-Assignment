package com.example.demo.service;

import com.example.demo.model.HotelModel;
import com.example.demo.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public List<HotelModel> getHotels() {
        return hotelRepository.findAll();
    }

    public void saveHotel(HotelModel hotel) {
        hotelRepository.save(hotel);
    }


}
