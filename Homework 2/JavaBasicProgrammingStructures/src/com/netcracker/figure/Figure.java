package com.netcracker.figure;

public class Figure {

    public static void rectangle() {
        int size = 5;

        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++ ) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void a() {
        int size = 8;
        for(int row = 1; row <= size; row++) {
            for(int col = 0; col < row; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void b() {
        int size = 8;
        for(int row = size; row >= 0; row--) {
            for(int col = 0; col < row; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void c() {
        int size = 8;

        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {
                if(col < row) System.out.print(" ");
                else System.out.print("#");

            }
            System.out.println();
        }

    }

    public static void d() {
        int size = 8;

        for(int row = 0; row < size; row++) {
            for(int col = size; col >= 0; col--) {
                if(row >= col) System.out.print("#");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
