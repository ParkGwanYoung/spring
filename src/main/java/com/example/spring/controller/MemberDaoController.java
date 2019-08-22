package com.example.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.spring.service.MemberDaoService;
import com.example.spring.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MemberDaoController {

    @Autowired
    private MemberDaoService service;

    @RequestMapping(value = "/dao/{action}")
    public ModelAndView list(@RequestParam Map<String, Object> paramMap,@PathVariable String action, ModelAndView modelandView){

        String viewName = "/dao/";
        List<Object> resultList = new ArrayList<Object>();
       
        if("read".equals(action)){
            viewName = viewName + action;
            resultList = (List<Object>)service.getObject(paramMap);
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("resultList", resultList);
        return modelandView;

    }
}