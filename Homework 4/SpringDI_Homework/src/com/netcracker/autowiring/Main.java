package com.netcracker.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        SpellcheckerServiceByConstructor serviceByConstructor = (SpellcheckerServiceByConstructor) applicationContext.getBean("SpellcheckerServiceByConstructor");
        serviceByConstructor.spellCheck();

        SpellcheckerServiceByName serviceByName = (SpellcheckerServiceByName) applicationContext.getBean("SpellcheckerServiceByName");
        serviceByName.spellCheck();

        SpellcheckerServiceByType serviceByType = (SpellcheckerServiceByType) applicationContext.getBean("SpellcheckerServiceByType");
        serviceByType.spellCheck();

    }
}
