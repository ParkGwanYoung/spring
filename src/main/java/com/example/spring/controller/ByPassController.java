package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ByPassController {
    @RequestMapping(value = { "/layout/defaultLayout" })
    public void byPass() {
    }
}