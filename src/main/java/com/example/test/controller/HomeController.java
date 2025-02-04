package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Vector;

@RestController
@RequestMapping(value = "/home")
public class HomeController {

    Vector<Integer> counter = new Vector<>();

    @GetMapping(value = "/page")
    public String home(){
        return "Hello World";
    }

    @GetMapping(value = "/add-number")
    public String add(){
        counter.add(counter.size() + 1);
        return  "Post Successfully added!";
    }

    @GetMapping(value = "/get-counter")
    public Vector<Integer> send(){
        return counter;
    }
}
