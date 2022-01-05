package com.example.spring_aop.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(Book book) {
        System.out.println("Мы берем книгу из UniLibrary:" + " " + book.getName());
    }

//    String returnBook() {
//        System.out.println("Мы возвращаем книгу в UniLibrary");
//        return "OK";
//    }

    public void getMagazine(int a) {
        System.out.println("Мы берём журнал из UniLibrary");
    }
}
