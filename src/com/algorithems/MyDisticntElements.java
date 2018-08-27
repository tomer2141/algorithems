package com.algorithems;

public class MyDisticntElements {
    public static void printDistinctElements(int[] arr){
        System.out.println("printDistinctElements");
        for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0; j < i; j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                System.out.print(arr[i]+", ");
            }
        }
    }
}
