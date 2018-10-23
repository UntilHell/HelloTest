package com.wanghang.algorithm.impl;

import com.wanghang.algorithm.ThreeSum;
import com.wanghang.algorithm.util.BinarySearch;

import java.util.Arrays;

public class ThreeSumBinarySearch implements ThreeSum {
    @Override
    public int count(int[] nums) {
        Arrays.sort(nums);
        int N = nums.length;
        int cnt = 0;
        for(int i =0;i<N;i++){
            for(int j =i+1; j<N;j++){
                int target =  -nums[i]-nums[j];
                int index = BinarySearch.search(nums,target);
                if(index > j){
                    cnt++;
                }
            }
        }
        return 0;
    }


}
