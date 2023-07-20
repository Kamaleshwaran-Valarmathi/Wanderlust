package com.example.Wanderlust.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {
    @RequestMapping("/error")
    public String handleError() {
        // Handle invalid endpoints by redirecting to the home page
        return "redirect:/";
    }
}
