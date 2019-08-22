package com.example.spring.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;


@Repository
public class MemberDao{
    public Object getObject(Object dataMap){
        List<Object> resultList = new ArrayList<Object>();

        Map<String,Object> resultObject1 = new HashMap<String,Object>();
        resultObject1.put("MEMBER_ID", "293029301202");
        resultObject1.put("NAME","name 01");

        Map<String,Object> resultObject2 = new HashMap<String,Object>();
        resultObject2.put("MEMBER_ID", "769659956");
        resultObject2.put("NAME","name 02");

        Map<String,Object> resultObject3 = new HashMap<String,Object>();
        resultObject3.put("MEMBER_ID", "293029301202");
        resultObject3.put("NAME","name 03");

        resultList.add(resultObject1);
        resultList.add(resultObject2);
        resultList.add(resultObject3);

        return resultList;
    }
}