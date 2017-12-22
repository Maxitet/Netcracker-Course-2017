package com.netcracker.mysort;

import java.util.Random;

public class MySort {

    public static void myRand(int[] array){
        Random rand = new Random();
        for(int i=0; i < array.length; i++) {
            array[i] = rand.nextInt(1000);
        }
    }

    public static void bubbleDes(int[] array) { //Descending order
        int temp;

        for(int i=0; i < array.length; i++) {
            for(int j = array.length-1; j > i; j--) {
                if(array[j] > array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void bubbleAsc(int[] array) { //Ascending order
        int temp;

        for(int i=0; i < array.length; i++) {
            for(int j = array.length-1; j > i; j--) {
                if(array[j] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void selectionAsc(int[] array) {
        int temp;
        int min;
        for(int i=0; i < array.length-1; i++) {
            min = i;
            for(int j = i+1; j < array.length; j++ ) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            if(min != i) {
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }

    public static void selectionDes(int[] array) {
        int temp;
        int min;
        for(int i=0; i < array.length-1; i++) {
            min = i;
            for(int j = i+1; j < array.length; j++ ) {
                if(array[j] > array[min]) {
                    min = j;
                }
            }
            if(min != i) {
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
}