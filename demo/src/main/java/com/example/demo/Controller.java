package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/health")
    public  Health health()
    {
        return new Health("healthy");
    }


    public Health getStatus(String status)
    {
        return new Health("fail");
    }






}
