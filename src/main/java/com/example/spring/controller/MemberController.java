package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member")
public class MemberController{
    @RequestMapping(value = {"/edit","/reade","/list"},
    method = {RequestMethod.GET,RequestMethod.POST})
    public void actionMethod(){}
}

    // @RequestMapping(value = "/member/signIn")
    // public void member_signIn() {
    // }

    // @RequestMapping(value = "/member/signOut")
    // public void member_signOut() {
    // }

    // @RequestMapping(value = "/member/signUp")
    // public void member_signUp() {
    // }