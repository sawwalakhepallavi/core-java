package com.qspider.array;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr={5,2,6,9,0};
        Arrays.sort(arr);

        for(int i=0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
