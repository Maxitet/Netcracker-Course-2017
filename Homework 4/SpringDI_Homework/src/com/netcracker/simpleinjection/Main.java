package com.netcracker.simpleinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        System.out.println("//// Инжектирование примитивных типов и объектов");
        Computer computer = (Computer) context.getBean("computer");
        System.out.println(computer);


        //Тест наследования
        System.out.println("//// Тест наследования");
        Notebook notebook = (Notebook) context.getBean("notebook");
        System.out.println(notebook);


        //Тест инжектирования с SpEL
        System.out.println("//// Инжектирование с SpEL");
        Computer preconfiguredComputer = (Computer) context.getBean("preconfiguredComputer");
        System.out.println(preconfiguredComputer);
    }
}
