package com.example.spring_aop.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* add*())")
    public void allAddMethods(){
    }
}
