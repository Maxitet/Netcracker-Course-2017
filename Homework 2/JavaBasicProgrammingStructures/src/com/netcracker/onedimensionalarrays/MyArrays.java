package com.netcracker.onedimensionalarrays;

import java.util.Arrays;
import java.util.Random;

public class MyArrays {

    public static void a() {
        int[] array = new int[50];

        for (int i = 1; i < 100; i++) {
            if(i % 2 == 1) {
                array[i/2] = i;
            }
        }

        System.out.println("Задание а");

        System.out.println(Arrays.toString(array));

        System.out.print("[");
        for (int i = 49; i >=0; i--) {
            System.out.print(array[i]);
            if(i != 0) System.out.print(", ");
            else System.out.println("]");

        }
    }

    public static void b() {
        Random random = new Random();
        int[] array = new int[20];
        int even = 0;
        int odd = 0;

        System.out.println("Задание b");

        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < 20; i++) {
            if (array[i] % 2 == 0) even += 1;
            else odd += 1;
        }

        System.out.println("Amount of even numbers: " + even + ", amount of odd numbers: " + odd);
    }

    public static void c() {
        int[] array = new int[10];
        Random random = new Random();

        System.out.println("Задание c");

        for (int i = 0; i < 10; i++) {
            array[i] = 1 + random.nextInt(99);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < 10; i++) {
            if(i % 2 != 0 ) array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void d() {
        int maxElem = 0;
        int minElem = 0;
        int maxElemIndex = 0;
        int minElemIndex = 0;
        int[] array = new int[15];
        Random random = new Random();

        System.out.println("Задание d");

        for (int i = 0; i < 15; i++) {
            array[i] = -50 + random.nextInt(100);
        }

        for (int i = 0; i < 15; i++) {
            if (maxElem < array[i]) {
                maxElem = array[i];
                maxElemIndex = i;
            }
            if (minElem > array[i]) {
                minElem = array[i];
                minElemIndex = i;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Min value is: " + minElem + ", last index is: " + minElemIndex);
        System.out.println("Max value is: " + maxElem + ", last index is: " + maxElemIndex);

    }

    public static void e() {
        Random random = new Random();
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        float avg1 = 0;
        float avg2 = 0;

        System.out.println("Задание e");

        for (int i = 0; i < 10; i++) {
            array1[i] = random.nextInt(10);
            array2[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < 10; i++) {
            avg1 +=((float) array1[i] / array1.length);
            avg2 +=((float) array2[i] / array2.length);
        }
        System.out.println("Avg1: " + avg1 + ", Avg2: " + avg2);
        if(avg1 > avg2) {
            System.out.println("Average value of first array is bigger that second array");
        }
        else if(avg1 < avg2) {
            System.out.println("Average value of second array is bigger than first array");
        }
        else {
            System.out.println("Average value of arrays is equal");
        }
    }

    public static void f() {
        Random random = new Random();
        int[] array = new int[20];
        int zero = 0;
        int one = 0;
        int minusOne = 0;

        System.out.println("Задание f");

        for (int i = 0; i < 20; i++) {
            array[i] = -1 + random.nextInt(3);
            if(array[i] == 0) {
                zero += 1;
            }
            else if(array[i] == 1) {
                one += 1;
            }
            else {
                minusOne += 1;
            }
        }
        //System.out.println(Arrays.toString(array));
        System.out.print("Самый часто встречающийся элемент(-ы): ");

        if(one > minusOne && one > zero) {
            System.out.println("1");
        }
        else if(zero > one && zero > minusOne) {
            System.out.println("0");
        }
        else if(minusOne > one && minusOne > zero) {
            System.out.println("-1");
        }
        else if(one == zero && zero == minusOne) {
            System.out.println("1 " + "0 " + "-1");
        }
        else if(one == zero) {
            System.out.println("1 " + "0");
        }
        else if(zero == minusOne) {
            System.out.println("1 " + "-1");
        }
    }
}
