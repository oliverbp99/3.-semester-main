package com.example.trash_api1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PokemonController {
    List<String> pokemon = new ArrayList<>(){{
        add("Charmander");
        add("Mew");
        add("Slow");
        add("Charmander");
    }};


    @GetMapping("/pokemon/go")
    public boolean pokemon(){
        return false;
    }


    @GetMapping("/pokemon")
    public List getAllPokemons(){

        return pokemon;
    }
}
