package com.leetcode.no0283;

public class Solution01 {

    public void moveZeros(int[] nums){

        int i = 0;

        for(int num:nums){
            if(num!=0){
                nums[i++] = num;
            }
        }

        for(; i < nums.length; i++){
            nums[i] = 0;
        }
    }

}
