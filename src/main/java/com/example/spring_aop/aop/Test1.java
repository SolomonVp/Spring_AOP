package com.example.spring_aop.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary unilibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);

        unilibrary.getBook();
        unilibrary.addBook("Victor", book);
        unilibrary.addMagazine();

//        unilibrary.returnMagazine();
//        unilibrary.addBook();


//        unilibrary.returnBook();
//        unilibrary.getMagazine(3);

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
