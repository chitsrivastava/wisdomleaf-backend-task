package com.wisdomleaf.task.controllers;

import com.wisdomleaf.task.services.ClockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spokenTime")
public class ClockController {

    @Autowired
    ClockService clockService;

    @GetMapping("/{time}")
    public String getSpokenTime(@PathVariable String time) {
        System.out.println("time in Controller ==>" +  time);
        return clockService.getSpokenTime(time);
    }
}
