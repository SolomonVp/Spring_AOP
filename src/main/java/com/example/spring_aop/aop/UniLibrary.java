package com.example.spring_aop.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary!");
    }

    String returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "OK";
    }

    public void getMagazine() {
        System.out.println("Мы берём журнал из UniLibrary");
    }
}
