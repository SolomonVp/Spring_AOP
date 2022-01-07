package com.example.spring_aop.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("com.example.spring_aop.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: Проверка прав на получение книги или журнала");
    }
}
