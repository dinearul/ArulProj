package com.mykarthik.testapp.controller;

import com.mykarthik.testapp.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    ClientService obj;

    @GetMapping("/get")
    public Object getNameAge() {
        return obj.getNameAge();
    }
    @GetMapping("/getaddr")
    public Object getAddress() {
        return obj.getAddress();
    }
   
   
}