package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "hotel")
public class HotelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "hotel_name")
    private String hotelName;

    public HotelModel() {}

    public void setId(Long id) {
        this.id = id;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Long getId() {
        return this.id;
    }

    public String getHotelName() {
        return this.hotelName;
    }

}
