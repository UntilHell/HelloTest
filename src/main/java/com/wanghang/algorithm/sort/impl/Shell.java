package com.wanghang.algorithm.sort.impl;

import com.wanghang.algorithm.util.Sort;

public class Shell<T extends Comparable<T>> extends Sort {

    @Override
    public void sort(Comparable[] nums) {

        int N = nums.length;
        int h = 1;
        while(h < N/3){
            h = 3 * h + 1;
        }
        while(h >= 1){
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h ; j-=h) {
                    swap(nums,j,j-h);
                }

            }
        }
    }
}
