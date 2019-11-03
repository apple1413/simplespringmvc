package com.enjoy.simple.service.impl;

import com.enjoy.simple.annotation.EnjoyService;
import com.enjoy.simple.service.SimpleService;

@EnjoyService("JamesServiceImpl")
public class SimpleServiceImpl implements SimpleService {
    
    public String query(String name, String age) {
        
        return "{name="+name+",age="+age+"}";
    }
    
    public String insert(String param) {
        // TODO Auto-generated method stub
        return  "insert successful.....";
    }
    
    public String update(String param) {
        // TODO Auto-generated method stub
        return "update successful.....";
    }
    
}
