package com.leetcode.no0075;

public class Solution02 {

    public void sortColors(int[] nums) {

        if(nums == null || nums.length == 0){
            return;
        }

        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while(mid <= right){
            if(nums[mid] == 0){ swap(nums,left++,mid++); }
            else if(nums[mid] == 1){ ++mid; }
            else{ swap(nums,mid,right--); }
        }

    }

    private void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    
}
