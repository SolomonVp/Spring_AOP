package com.example.spring_aop.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Моби дик или белый кит")
    private String name;

    @Value("Герман Мелвилл")
    private String author;

    @Value("1898")
    private String yearOfPublication;

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public String getYearOfPublication() {
        return yearOfPublication;
    }
}
