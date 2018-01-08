package com.netcracker.simpleinjection;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("main")
public class Radeon7850 implements VCard {

    public Radeon7850() {
        System.out.println("Radeon7850.Radeon7850");
    }

    public void compute() {
        System.out.println("You're using Radeon7850");
    }
}
