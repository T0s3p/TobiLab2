package com.example.TobiLab2.controller;
/*
Student ID:301232583
Name: Oluwatobiloba Abel
Course: COMP228 Section 17
Assignment:
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;

@Controller
public class WelcomeController {



    @GetMapping("/")
    public String greeting(Model model) {
        LocalTime currentTime = LocalTime.now();
        String greetingMessage;

        if (currentTime.isBefore(LocalTime.NOON)) {
            greetingMessage = "Good morning, Tobi, Welcome to COMP367";
        } else if (currentTime.isBefore(LocalTime.of(18, 0))) {
            greetingMessage = "Good afternoon, Tobi, Welcome to COMP367";
        } else {
            greetingMessage = "Good evening, Tobi, Welcome to COMP367";
        }

        model.addAttribute("message", greetingMessage);
        return "welcome";
    }
}
