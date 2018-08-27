package com.algorithems;

public class Main {
//Helper function to print arrays
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public static void main(String[] args) {

        //myDisticntArr section
	        int[] myDisticntArr = {1,0,1,5,5,4,3,2,4,5,9};
            MyDisticntElements.printDistinctElements(myDisticntArr);
        //myDisticntArr end

        System.out.println();

        //Fibonacci section
            Fibonacci.createFbArr();
        //Fibonacci end

        System.out.println();

        //Bubble sort section
            int[] bubbleSortArr = {0,9,3,6,2,1};
            BubbleSort.MyBubbleSort(bubbleSortArr);
        //Bubble sort end

        System.out.println();

        //Bubble sort section
        int[] mergeSortArr = {0,9,3,6,2,1};
        MergeSort mergeSort = new MergeSort(mergeSortArr);
        //Bubble sort end


    }
}
