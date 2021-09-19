package com.istepaniuk.crasher.controller;

import com.istepaniuk.crasher.Status;
import org.springframework.web.bind.annotation.*;

@RestController
public class StatusController {
    @GetMapping("/")
    public Status getIndex(boolean shouldCrash) {
        if(shouldCrash){
            System.exit(1);
        }

        return new Status("works", "fine");
    }
}
