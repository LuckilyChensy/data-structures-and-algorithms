package com.leetcode.no0189;

public class Solution02 {

    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k<=0){
            return;
        }
        int n = nums.length,m = k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,m-1);
        reverse(nums,m,n-1);
    }

    private void reverse(int[] nums,int i, int j){
        for(;i < j; ++i,--j){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }

}
