package com.leetcode.no0724;

public class Solution01 {
    public int pivotIndex(int[] nums) {

        if( nums == null || nums.length == 0){
            return -1;
        }

        int n = nums.length;

        int[] preSum = new int[n+1];

        for(int i = 1; i <= n; i++){
            preSum[i] = preSum[i-1] + nums[i-1];
        }

        for(int i = 0; i < n; i++){
            if(preSum[i] == preSum[n] - preSum[i+1]){
                return i;
            }
        }

        return -1;

    }
}
