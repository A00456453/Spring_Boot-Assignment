package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "guest")
@JsonInclude(JsonInclude.Include.NON_NULL)
class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "guest_id")
    private Long guestId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="reservation_id")
    private ReservationModel reservationId;

    @Column(name = "guest_name")
    @JsonProperty("guest_name")
    private String guestName;

    @Column(name = "gender")
    @JsonProperty("gender")
    private String gender;

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public ReservationModel getReservationId() {
        return reservationId;
    }

    public void setReservationId(ReservationModel reservationId) {
        this.reservationId = reservationId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestId=" + guestId +
                ", reservationId=" + reservationId +
                ", guestName='" + guestName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}