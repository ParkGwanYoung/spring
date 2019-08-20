package com.example.spring.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class OrganizationController{
    
    @RequestMapping(value = "/read")
    public ModelAndView read(@RequestParam Map<String, Object> paramMap, ModelAndView modelandView){
        //위에 --서버가 클라이언트로 보내는 문법
        //아래 서버가 클라이언트로 응답하기 위한 문법
        String viewName = "/organization/read";
        modelandView.setViewName(viewName);
        modelandView.addObject("resultMap", paramMap);
        return modelandView;

    }

    
    @RequestMapping(value = "/organization/insert")
    public void actionmethod(){
    }
}
