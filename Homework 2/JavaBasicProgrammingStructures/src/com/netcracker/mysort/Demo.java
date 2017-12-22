package com.netcracker.mysort;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        int[] array = new int[150];
        int[] arrayCopy;
        long startTime;
        long estimatedTime;
        MySort.myRand(array);

        System.out.println("Сортировка по возрастанию, массив 150 случайных чисел");

        arrayCopy = Arrays.copyOf(array, 150);
        startTime = System.nanoTime();
        MySort.bubbleAsc(arrayCopy);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время сортировки пузырьком: " + estimatedTime);

        arrayCopy = Arrays.copyOf(array, 150);
        startTime = System.nanoTime();
        MySort.selectionAsc(arrayCopy);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время сортировки выбором:" + estimatedTime);

        arrayCopy = Arrays.copyOf(array, 150);
        startTime = System.nanoTime();
        Arrays.sort(arrayCopy);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время сортировки методом sort():" + estimatedTime);

        System.out.println();

        System.out.println("Сортировка по убыванию, массив 150 случайных чисел");
        arrayCopy = Arrays.copyOf(array, 150);
        startTime = System.nanoTime();
        MySort.bubbleDes(arrayCopy);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время сортировки пузырьком:" + estimatedTime);

        arrayCopy = Arrays.copyOf(array, 150);
        startTime = System.nanoTime();
        MySort.selectionDes(arrayCopy);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время сортировки выбором:" + estimatedTime);

    }

}
