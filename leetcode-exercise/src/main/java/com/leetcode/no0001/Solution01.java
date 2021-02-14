package com.leetcode.no0001;

/**
 * 朴素解法
 */
public class Solution01 {

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length-1; i++){
            int temp = target - nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] == temp){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
