package com.istepaniuk.crasher.controller;

import com.istepaniuk.crasher.Status;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

@RestController
public class StatusController {
    @GetMapping("/")
    public List<Status> getIndex(boolean shouldCrash) throws UnknownHostException {
        if (shouldCrash) {
            System.exit(1);
        }

        return Arrays.asList(
                new Status("works", "fine"),
                new Status("host", InetAddress.getLocalHost().getHostName())
        );
    }
}
