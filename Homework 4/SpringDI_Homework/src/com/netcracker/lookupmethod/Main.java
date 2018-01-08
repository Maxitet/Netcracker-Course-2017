package com.netcracker.lookupmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Car car = (Car) context.getBean("car");

        //Тестируем 2 внедрённых метода
        Engine engine = car.engine();
        System.out.println(engine);

        Engine turbo = car.turboEngine();
        System.out.println(turbo);
    }
}
