package chy.service;

import chy.spring.annotation.ChyService;

import java.lang.reflect.Method;

@ChyService
public class MyService {


    public String xiaoxiao(String xx){
        System.out.println("执行了xiaoxiao方法");
        return "xxxxxx";
    }


    public static void main(String[] args) throws NoSuchMethodException {
        String r =  "";


        Class<MyService> myServiceClass = MyService.class;
        Method xiaoxiao = myServiceClass.getMethod("xiaoxiao",String.class);
        String t = xiaoxiao.toString();
        boolean matches = t.matches(r);
        System.out.println(matches);

    }


}
