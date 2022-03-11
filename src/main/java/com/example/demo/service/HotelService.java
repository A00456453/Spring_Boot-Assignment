package com.example.demo.service;

import com.example.demo.model.*;
import com.example.demo.repository.HotelRepository;
import com.example.demo.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    public HotelList getHotels() {
        HotelList hotelList = new HotelList();
        hotelList.setHotelList(hotelRepository.findAll());
        return hotelList;
    }

    public void saveHotel(HotelModel hotel) {
        hotel = hotelRepository.save(hotel);
    }

    public ConfirmReservationResponse confirmReservation(ConfirmReservationRequest confirmReservationRequest) {
        List<HotelModel> hotelList = hotelRepository
                .findAll()
                .stream()
                .filter(h -> h.getHotelName().equalsIgnoreCase(confirmReservationRequest.getHotelName()))
                .collect(Collectors.toList());
        System.out.println(hotelList);
        ConfirmReservationResponse response = new ConfirmReservationResponse();
        if(hotelList.isEmpty()) {
            // TODO: error
            response.setError("No hotel found");
            return response;
        }
        HotelModel hotel = hotelList.get(0);
        ReservationModel reservationModel = new ReservationModel();
        reservationModel.setCheckIn(confirmReservationRequest.getCheckIn());
        reservationModel.setCheckOut(confirmReservationRequest.getCheckOut());
        reservationModel.setHotelId(hotel.getHotelId());
        reservationModel.setGuestList(confirmReservationRequest.getGuestList());
        reservationModel = reservationRepository.save(reservationModel);

        response.setConfirmationNumber(reservationModel.getReservationId().toString());
        System.out.println(reservationModel);
        return response;
    }
}
