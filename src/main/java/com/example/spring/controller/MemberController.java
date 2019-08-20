package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
    @RequestMapping(value = "/member/signIn")
    public void member_signIn() {
    }

    @RequestMapping(value = "/member/signOut")
    public void member_signOut() {
    }

    @RequestMapping(value = "/member/signUp")
    public void member_signUp() {
    }

}