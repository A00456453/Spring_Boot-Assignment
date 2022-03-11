package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hotel")
public class HotelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hotel_id")
    @JsonProperty("hotel_id")
    private Long hotelId;

    @Column(name = "hotel_name")
    @JsonProperty("hotel_name")
    private String hotelName;

    @Column(name = "price")
    private Integer price;

    @Column(name = "availability")
    private Integer availability;

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "HotelModel{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                '}';
    }
}

