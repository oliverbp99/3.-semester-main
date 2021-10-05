package com.example.trash_api1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Supermario {

    @GetMapping("/supermario/characters")
    public String mario(){
        return "Hello";
    }
}
