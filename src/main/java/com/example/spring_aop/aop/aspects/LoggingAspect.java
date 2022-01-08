package com.example.spring_aop.aop.aspects;


import com.example.spring_aop.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* com.example.spring_aop.aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//
//    }
//
//    @Pointcut("execution(public void com.example.spring_aop.aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodExceptReturnMagazineAdvice: Log #10" );
//    }

//    @Pointcut("execution(* com.example.spring_aop.aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//    }
//    @Pointcut("execution(* com.example.spring_aop.aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {
//    }
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){
//    }
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }




    // com.example.spring_aop.aop.UniLibrary.
    @Before("com.example.spring_aop.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for(Object obj : arguments) {
                if (obj instanceof Book) {
                    Book meBook = (Book) obj;
                    System.out.println("Информация о книге: название книги - " + meBook.getName() + ", автор - " + meBook.getAuthor() + ", год издания - " + meBook.getYearOfPublication());
                }
                else if (obj instanceof String) {
                    System.out.println("Книгу в библиотеку добавляет " + obj);
                }
            }
        }

        System.out.println("beforeGetBookAdvice: логгирование попытки получить книгу или журнал");
        System.out.println("*****************************************************************************************");
    }



}
