package com.leetcode.no0283;

public class Solution01 {
    public void moveZeros(int[] nums){
        int index = 0;
        for(int num:nums){
            if(num!=0){
                nums[index++] = num;
            }
        }
        for(int i = index; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
