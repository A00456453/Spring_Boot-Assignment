package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfirmReservationResponse {

    @JsonProperty("confirmation_number")
    private String confirmationNumber;

    @JsonProperty("error")
    private String error;

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }
}
