package com.intelcia;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InvoicesApplication {
 
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("spring-config.xml");
    }
 
}