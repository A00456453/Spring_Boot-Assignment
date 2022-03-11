package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class HotelList {

    @JsonProperty("hotels_list")
    private List<HotelModel> hotelList;

    public List<HotelModel> getHotelList() {
        return hotelList;
    }

    public void setHotelList(List<HotelModel> hotelList) {
        this.hotelList = hotelList;
    }
}
