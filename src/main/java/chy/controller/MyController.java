package chy.controller;

import chy.service.MyService;
import chy.spring.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ChyController
@ChyRequestMapping("/chy/")
public class MyController {

    @ChyAutowired
    public MyService myService;

    @ChyRequestMapping("/test")
    public String test(@ChyRequestParam("age") Integer age, String xx, HttpServletRequest request){
        System.out.println(age + "@@@@@@@@" + xx + "##########"+request);
        return "/index.html";
    }

    @ChyRequestMapping("/test2")
    @ChyResponebody
    public Map<String,Object> test2(@ChyRequestParam("age") Integer age,@ChyRequestParam("name") String name,String xx, HttpServletRequest request){
       Map<String,Object> pa = new HashMap<>();
       pa.put("age",age);
       pa.put("name",name);
       return pa;
    }

    @ChyRequestMapping("/aop")
    @ChyResponebody
    public String aopTest(){
        myService.xiaoxiao("xxxxx");
        return "什么鬼";
    }


}
