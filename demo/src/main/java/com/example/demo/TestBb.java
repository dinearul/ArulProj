package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "karthik")
public class TestBb {


@GetMapping(value = "rest")
public String isThisRest(){
    return "Yes This is Rest controller";
}

}