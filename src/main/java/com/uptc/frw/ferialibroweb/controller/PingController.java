package com.uptc.frw.ferialibroweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @GetMapping("/ping")
    public String test(){
        return "Pong!";
    }
}
