package com.example.demo.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@JsonInclude(Include.NON_NULL)
public class Locationresponse {

    private String address;
    private String citystate;
    private String country;
    private String countryr;
    private String countddryr;
    private String counddtrry;
    private String countrrddy;
}