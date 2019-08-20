package com.example.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class CommonCodeController{
    
    @RequestMapping(value = "/commonCode/{action}")
    public ModelAndView edit(@RequestParam Map<String, Object> paramMap,@PathVariable String action, ModelAndView modelandView){
        //위에 --서버가 클라이언트로 보내는 문법
        //아래 서버가 클라이언트로 응답하기 위한 문법
        String viewName = "/commonCode/";
        Map<String,Object> resultMap = new HashMap<String,Object>();
        if("edit".equals(action)){
            viewName = viewName + action;
            resultMap = paramMap;
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("resultMap", resultMap);
        return modelandView;

    }

    
    @RequestMapping(value = "/commonCode/insert")
    public void actionmethod(){
    }
}
