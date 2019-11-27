package com.example.demo;

import com.example.demo.request.LocationRequest;
import com.example.demo.request.Locationresponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestAa {

    @GetMapping(value="/nameage",produces = {MediaType.TEXT_PLAIN_VALUE})
    public String nameAge(@RequestParam String name, @RequestParam int age) {

        String res = "Name :" + name + "\n" + "Age :" + age + "\n";
        String ress = "Name :" + name + "Age :" + age;
        return res + ress + "Name :" + name + "Age :" + age + "Name :" + name + "Age :" + age  + ress;
    }

    @PostMapping(value= "/addr",  consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
        MediaType.APPLICATION_JSON_VALUE })
    public Locationresponse cityState(@RequestBody LocationRequest locationRequest) {
        Locationresponse locationresponse = new Locationresponse();
        String addr = null;
        String x = null;
        String y = null;

        if (locationRequest != null) {

            if (locationRequest.getAddress() != null) {

                addr = locationRequest.getAddress().getHouseNo() + locationRequest.getAddress().getStreet()
                        + locationRequest.getAddress().getArea();
                        locationresponse.setAddress(addr);

            }
            x = String.format("My city is %1s and my state is %2s and pincode is %3s",
                    locationRequest.getCity(), locationRequest.getState(), locationRequest.getPinCode());

                    locationresponse.setCitystate(x);
                    locationresponse.setCountry(y);

        }
        return locationresponse;

    }

}


