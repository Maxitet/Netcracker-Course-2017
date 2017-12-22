package com.netcracker.factorial;

public class Factorial {

    public static long factorialRecursion(long value) {
        long result;
        if(value == 1) return 1;
        result = factorialRecursion(value - 1) * value;
        return result;
    }

    public static long factorialCycle(long value) {
        for (int i = (int) value - 1; i > 0; i--) {
            value *= i;
        }
        return value;
    }
}
