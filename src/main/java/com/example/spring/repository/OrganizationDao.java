package com.example.spring.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrganizationDao{
    @Autowired
    private SqlSessionTemplate sqlSession;
    public Object getObject(String sqlMapId, Object dataMap){
        Object result = sqlSession.selectOne(sqlMapId,dataMap);
        return result;
    }
}