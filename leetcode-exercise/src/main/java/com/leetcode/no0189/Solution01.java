package com.leetcode.no0189;

public class Solution01 {
    public void rotate(int[] nums, int k) {

        if(nums == null || nums.length == 0 || k <= 0){
            return ;
        }

        int n = nums.length,m = k%n, i = 0;

        int[] t = new int[n];

        for(int j = n-m; j < n; ++j){
            t[i++] = nums[j];
        }

        for(int j = 0; j < n-m; ++j){
            t[i++] = nums[j];
        }

        for(int j = 0; j < n; ++j){
            nums[j] = t[j];
        }

    }
}
