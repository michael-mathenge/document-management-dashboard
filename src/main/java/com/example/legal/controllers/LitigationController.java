package com.example.legal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LitigationController {
    @GetMapping("/litigations")
    public String getLitigations(){
        return "litigations";
    }
}
