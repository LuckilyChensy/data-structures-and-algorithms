package com.leetcode.no0560;

public class Solution01 {

    public int subarraySum(int[] nums, int k) {

        if(nums == null || nums.length == 0){ return 0; }

        int count = 0;
        int length = nums.length;

        for(int i = 0; i < length; i++){
            int sum = 0;
            for(int j = i; j < length; ++j){
                sum += nums[j];
                if(sum == k){
                    ++count;
                }
            }
        }

        return count;

    }

}
