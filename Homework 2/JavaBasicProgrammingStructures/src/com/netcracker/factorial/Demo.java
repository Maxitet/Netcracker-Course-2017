package com.netcracker.factorial;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Вычисление 20!");
        long startTime1;
        long estimatedTime1;

        Factorial.factorialCycle(1); //Для точности замеров... Прогрев (?)

        startTime1 = System.nanoTime();
        Factorial.factorialCycle(20);
        estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println("Время вычисления циклом " + estimatedTime1);

        Factorial.factorialRecursion(1);

        startTime1 = System.nanoTime();
        Factorial.factorialRecursion(20);
        estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println("Время вычисления рекурсией " + estimatedTime1);


    }
}
