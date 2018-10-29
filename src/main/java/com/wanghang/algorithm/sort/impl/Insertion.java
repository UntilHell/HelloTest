package com.wanghang.algorithm.sort.impl;

import com.wanghang.algorithm.util.Sort;

public class Insertion<T extends Comparable<T>> extends Sort {

    @Override
    public void sort(Comparable[] nums) {
        int N = nums.length;
        for (int i = 1; i < N - 1 ; i++) {
            for (int j = i; j > 0 && less(nums[j],nums[j-1]) ; j++) {
                swap(nums,j,j-1);
            }
        }
    }
}
