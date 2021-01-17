package com.leetcode.no0034;

public class Solution01 {

    public int[] searchRange(int[] nums,int target){
        // 处理边界情况
        if(nums == null || nums.length == 0){
            return new int[]{-1,-1};
        }

        int n = nums.length,start = -1,end = -1;

        for(int i = 0; i < n; i++){
            if(nums[i] == target){
                start = i;
                break;
            }
        }

        for(int j = n-1; j >=0; --j){
            if(nums[j] == target){
                end = j;
                break;
            }
        }

        return new int[]{start,end};
    }
}
