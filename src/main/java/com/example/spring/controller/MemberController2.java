package com.example.spring.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.spring.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController2 {

    @Autowired
    private MemberService service;

    @RequestMapping(value = "/member2/{action}")
    public ModelAndView list(@RequestParam Map<String, Object> paramMap,@PathVariable String action, ModelAndView modelandView){
        
        Map<String,Object> resultMap = new HashMap<String,Object>();
        String viewName = "/member2/";
        
       
        if("read".equals(action)){
            viewName = viewName + action;
            resultMap = (Map<String, Object>) service.getObject(paramMap);
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("resultMap", resultMap);
        return modelandView;

    }
}