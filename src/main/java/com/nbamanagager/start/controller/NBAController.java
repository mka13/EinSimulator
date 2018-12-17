package com.nbamanagager.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NBAController {
    @GetMapping("/test")
    String test(){
        return "<h1>TEST</h1>";
    }
}
