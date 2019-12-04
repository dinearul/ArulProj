package com.example.demo.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class LocationRequest {


    private String city;
    private String state;
    private int pinCode;
    private Address address;

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Address {

        private String street;
        private String area;
        private int houseNo;

    }

}
