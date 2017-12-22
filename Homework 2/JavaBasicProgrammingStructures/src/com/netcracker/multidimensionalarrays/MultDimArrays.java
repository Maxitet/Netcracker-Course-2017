package com.netcracker.multidimensionalarrays;

import java.util.Arrays;
import java.util.Random;

public class MultDimArrays {
    public static void a() {
        Random random = new Random();
        int[][] array = new int[8][8];
        int mainDiagSum = 0;
        long mainDiagMult = 1;
        int collateralDiagSum = 0;
        long collateralDiagMult = 1;

        System.out.println("Задание a");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                array[i][j] = 1+ random.nextInt(99);
                // System.out.print(array[i][j] + " ");
            }
        }

        for (int i = 0; i < array.length; i++) {
            mainDiagSum += array[i][i];
            mainDiagMult *= array[i][i];

            collateralDiagSum += array[i][array.length - i - 1];
            collateralDiagMult *= array[i][array.length - i - 1];
        }
        System.out.println("mainDiagSum = " + mainDiagSum + ", mainDiagMult = " + mainDiagMult);
        System.out.println("collateralDiagSum = " + collateralDiagSum + ", collateralDiagMult = " + collateralDiagMult );
    }

    public static void b() {
        Random random = new Random();
        int[][] array = new int[8][5];
        int maxElemRow = 0;
        int maxElemCol = 0;
        int maxElem = 0;

        System.out.println("Задание b");

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 5; j++) {
                array[i][j] = -99 + random.nextInt(199);

                if(array[i][j] > maxElem) {
                    maxElem = array[i][j];
                    maxElemRow = i;
                    maxElemCol = j;
                }
            }
        }

        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("Max element is " + maxElem + " at index [" + maxElemRow + "][" + maxElemCol + "]");
    }

    public static void c() {
        Random random = new Random();
        int[][] array = new int[8][5];
        int rowMult = 1;
        int rowMultIndex = 0;

        System.out.println("Задание c");

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 5; j ++) {
                array[i][j] = -10 + random.nextInt(21);
            }
        }

        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }

        for (int i = 0; i < 8; i++) {
            int rowTemp = 1;

            for (int j = 0; j < 5; j++) {
                rowTemp *= Math.abs(array[i][j]);

                if(rowTemp > rowMult) {
                    rowMult = rowTemp;
                    rowMultIndex = i;
                }
            }
        }

        System.out.println("Max sum of row is at index " + rowMultIndex);
    }

    public static void d() {
        Random random = new Random();
        int[][] array = new int[10][7];

        System.out.println("Задание d");

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 7; j++) {
                array[i][j] = random.nextInt(101);
            }
        }

        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println( "Отсортированный массив: ");

        for (int i = 0; i < 10; i++) {
            array[i] = mySort(array[i]);
        }

        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }

    }

    private static int[] mySort(int[] array) {
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
        return array;
    }
}
