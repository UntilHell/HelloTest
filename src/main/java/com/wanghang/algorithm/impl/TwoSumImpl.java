package com.wanghang.algorithm.impl;

import com.wanghang.algorithm.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumImpl implements TwoSum {

    //1.循环；2.查找相反数；3.map集合

    //3
    @Override
    public int[] count(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0 ;i < nums.length; i++){
            int needNum = target - nums[i];
            if(map.containsKey(needNum)){
                return new int[]{map.get(needNum),i};

            }
            map.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
}
