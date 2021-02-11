package com.leetcode.no1802;

public class Solution01 {

    public int[] exchange(int[] nums) {

        if(nums == null || nums.length == 0){
            return nums;
        }

        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            while((nums[left]&1)!=0 && left < right){
                left ++;
            }
            while((nums[right]&1)==0 && left < right){
                right --;
            }

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }

        return nums;
    }

}
