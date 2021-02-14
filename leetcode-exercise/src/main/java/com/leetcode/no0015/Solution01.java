package com.leetcode.no0015;

import java.util.*;

/**
 * 朴素解法
 */
public class Solution01 {

    public List<List<Integer>> threeSum(int[] nums) {

        // 用于记录所有符合条件的结果
        List<List<Integer>> result = new ArrayList<>();

        // set用于过滤重复的组合
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for(int i = 0; i<nums.length-2; i++){
            for(int j = i+1; j<nums.length-1; j++){
                for(int k = j+1; k<nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                        if(set.contains(temp)){ continue; }
                        set.add(temp);
                        result.add(temp);
                    }
                }
            }
        }
        return result;
    }
}
