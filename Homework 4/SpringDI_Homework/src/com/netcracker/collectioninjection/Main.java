package com.netcracker.collectioninjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Smartphones smartphones = (Smartphones) context.getBean("smartphones");

        System.out.println(smartphones);
        System.out.println(smartphones.getSmartphonesList());
        System.out.println(smartphones.getSmartphonesMap());
        System.out.println(smartphones.getSmartphonesSet());
    }
}
