package com.example.spring.service;

import com.example.spring.repository.MemberDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberDaoService {
    @Autowired
    private MemberDao dao;

    public Object getObject(Object dataMap){
        Object resultObject = dao.getObject(dataMap);
        return resultObject;
    }
}
