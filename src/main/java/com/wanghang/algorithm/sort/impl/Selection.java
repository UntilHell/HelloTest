package com.wanghang.algorithm.sort.impl;

import com.wanghang.algorithm.util.Sort;

public class Selection<T extends Comparable<T>> extends Sort {

    @Override
    public void sort(Comparable[] nums) {
        int N = nums.length ;
        for (int i = 0; i < N -1; i++) {
            int min = i;
            for (int j = i+1; j < N -1 ; j++) {
                if(less(nums[j],nums[i])){
                    min = j ;
                }
            }
            swap(nums,i,min);
        }
    }
}
