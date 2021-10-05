package com.example.trash_api1.controller;


import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
public class TrashController {

    static String[] deadlySins = {"Greed", "Wrath", "Gluttony", "Lust", "Envy", "Sloth", "Pride"};

    @GetMapping("/")
    public String frontpage(){
        return "Hej";
    }

    @GetMapping("/clock")
    public Date clock(){
        return new Date();
    }

    @GetMapping("/deadlysins/{deadlysin}")
    public String sevenDeadlySins(@PathVariable("deadlysin") int deadlysin){
        return deadlySins[deadlysin];
    }

    @GetMapping("/trash")
    public String trashData(@RequestParam String trash){
        return trash;
    }

    @PostMapping("/rubbishbin")
    public String throwOutRubbish(@RequestBody String rubbish){
        System.out.println(rubbish);
        return "Everything went well";
    }
}
