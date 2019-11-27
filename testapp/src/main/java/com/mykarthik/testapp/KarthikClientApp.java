package com.mykarthik.testapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KarthikClientApp {

    @Autowired
    KarthikClientService obj;

    @GetMapping("/get")
    public Object getNameAge() {
        return obj.getNameAge();
    }
    @GetMapping("/getaddr")
    public Object getAddress() {
        return obj.getAddress();
    }
   
   
}