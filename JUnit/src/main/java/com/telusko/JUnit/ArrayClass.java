package com.telusko.JUnit;

import java.util.Arrays;

public class ArrayClass {
    public int[] ArrayClass(int []arr){

        // Here we are using for loop to test the assertTimeOut(), otherwise there is no need to use it.
        for(int i =0; i<=100000; i++){
            Arrays.sort(arr);
        }
       return arr;
    }
}
