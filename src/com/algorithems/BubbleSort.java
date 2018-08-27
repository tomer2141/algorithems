package com.algorithems;

import java.util.Arrays;

public class BubbleSort {
    public static void MyBubbleSort(int[] arr){
        System.out.println("Bubble Sort");
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        int n = arr.length;
        int k;
        for(int m = n; m >= 0; m--){
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (arr[i] > arr[k]) {
                    int tempElement = arr[i];
                    arr[i] = arr[k];
                    arr[k] = tempElement;
                }
            }
        }
        System.out.println("from");
        Main.printArr(arrCopy);
        System.out.println("\nto");
        Main.printArr(arr);
    }
}
