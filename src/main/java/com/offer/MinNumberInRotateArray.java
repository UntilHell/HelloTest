package com.offer;

public class MinNumberInRotateArray {


    public int minNumberInRotateArray(int [] array) {

        int low = 0;
        int high = array.length - 1;

        while (low < high){
            int middle = (low + high) / 2;
            if(array[middle] > array[middle -1]){
                low = middle ;
            }
        }
        return -1;
    }

}
