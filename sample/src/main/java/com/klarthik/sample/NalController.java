package com.klarthik.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nal")
public class NalController {
//test
    @GetMapping("per")
    public String per(@RequestParam("name") String peru, @RequestParam int age) {
        
        //newnew

        String d = "Hello " + peru + " And age is " + age;
        return d;
    }
}
