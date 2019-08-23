package com.example.spring.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.spring.service.MemberService;
import com.example.spring.service.OrganizationDaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrganizationDaoController {

    @Autowired
    private OrganizationDaoService service;

    @RequestMapping(value = "/organization/{action}")
    public ModelAndView list(@RequestParam Map<String, Object> paramMap,@PathVariable String action, ModelAndView modelandView){
        
        Map<String,Object> resultObject = new HashMap<String,Object>();
        String viewName = "/organization/";
        
       
        if("list".equals(action)){
            viewName = viewName + action;
            resultObject = (Map<String, Object>) service.getObject(paramMap);
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("resultObject", resultObject);
        return modelandView;

    }
}