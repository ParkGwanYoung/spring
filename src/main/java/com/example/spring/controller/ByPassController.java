package com.example.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class ByPassController {
    @RequestMapping(value = { "/thymeleafmerge/thymeleafBase" })
    public void bypass() {
    }
}