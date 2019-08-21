package com.example.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ListController{
    
    @RequestMapping(value = "/list/{action}")
    public ModelAndView list(@RequestParam Map<String, Object> paramList,@PathVariable String action, ModelAndView modelandView){
        //위에 --서버가 클라이언트로 보내는 문법
        //아래 서버가 클라이언트로 응답하기 위한 문법
        String viewName = "/list/";
        List<Object> resultList = new ArrayList<Object>();
       
        if("list".equals(action)){
            viewName = viewName + action;
            resultList.add(paramList);
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("resultList", resultList);
        return modelandView;

    }

    
    @RequestMapping(value = "/list/insert")
    public void actionmethod(){
    }
}
