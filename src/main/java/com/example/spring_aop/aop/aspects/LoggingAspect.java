package com.example.spring_aop.aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {


    // com.example.spring_aop.aop.UniLibrary.
    @Before("execution(public void getBook(com.example.spring_aop.aop.Book))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
    }

//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: Попытка вернуть книгу");
//    }

}
