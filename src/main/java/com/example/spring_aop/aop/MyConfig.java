package com.example.spring_aop.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.spring_aop.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
