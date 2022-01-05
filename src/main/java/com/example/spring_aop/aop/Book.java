package com.example.spring_aop.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Моби дик или белый кит")
    private String name;

    public String getName() {
        return name;
    }
}
