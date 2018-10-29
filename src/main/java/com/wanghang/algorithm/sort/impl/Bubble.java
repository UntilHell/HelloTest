package com.wanghang.algorithm.sort.impl;

import com.wanghang.algorithm.util.Sort;

public class Bubble<T extends Comparable<T>> extends Sort {

    @Override
    public void sort(Comparable[] nums) {
        int N =nums.length;
        boolean hasSorted = false;
        for (int i = N-1; i > 0 && !hasSorted;i--) {
            hasSorted = true;
            for (int j = 0; j < i; j++) {
                if(less(nums[j+1],nums[j])){
                    hasSorted = false;
                    swap(nums,j,j+1);
                }
            }
        }
    }
}
