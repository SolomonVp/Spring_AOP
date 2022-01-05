package com.example.spring_aop.aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Мы берем книгу!");
    }
}