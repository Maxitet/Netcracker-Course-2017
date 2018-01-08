package com.netcracker.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        System.out.println("*****************");
        System.out.println("Factory Method:");
        Playable playable = (Playable) context.getBean("playable");
        playable.play();
    }
}
