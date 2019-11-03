package com.enjoy.simple.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.enjoy.simple.annotation.EnjoyController;
import com.enjoy.simple.annotation.EnjoyQualifier;
import com.enjoy.simple.annotation.EnjoyRequestMapping;
import com.enjoy.simple.annotation.EnjoyRequestParam;
import com.enjoy.simple.service.SimpleService;

@EnjoyController
@EnjoyRequestMapping("/james")
public class SimpleController {
    
    @EnjoyQualifier("JamesServiceImpl")
    private SimpleService simpleService;
    
    @EnjoyRequestMapping("/query")
    public void query(HttpServletRequest request, HttpServletResponse response,
            @EnjoyRequestParam("name") String name,
            @EnjoyRequestParam("age") String age) {
        
        try {
            PrintWriter pw = response.getWriter();
            String result = simpleService.query(name,age);
            pw.write(result);
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    @EnjoyRequestMapping("/insert")
    public void insert(HttpServletRequest request,
            HttpServletResponse response) {
        try {
            PrintWriter pw = response.getWriter();
            String result = simpleService.insert("0000");
            
            pw.write(result);
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    @EnjoyRequestMapping("/update")
    public void update(HttpServletRequest request,
            HttpServletResponse response, String param) {
        try {
            PrintWriter pw = response.getWriter();
            String result = simpleService.update(param);
            
            pw.write(result);
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
