package com.algorithems;

public class Fibonacci {
    public static void createFbArr() {
        System.out.println("Fibonacci");
        int fbCount = 20;
        int[] fibonacciArr = new int[fbCount];
        fibonacciArr[0] = 0;
        fibonacciArr[1] = 1;
        for (int i = 2; i < fbCount; i++){
            fibonacciArr[i] = fibonacciArr[i - 2] + fibonacciArr[i - 1];
        }

        //Print the fb array
        Main.printArr(fibonacciArr);
    }
}
