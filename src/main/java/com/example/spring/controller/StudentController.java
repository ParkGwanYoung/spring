package com.example.spring.controller;

import java.util.List;
import java.util.Map;

import com.example.spring.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @RequestMapping(value = "/student/{action}")
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandview) {

        if ("list".equals(action)) {
            String viewName = "/student/" + action;
            List<Object> resultList = (List) repository.findAll();
            modelandview.setViewName(viewName);
            modelandview.addObject("resultList", resultList);
        }

        return modelandview;
    }
}
