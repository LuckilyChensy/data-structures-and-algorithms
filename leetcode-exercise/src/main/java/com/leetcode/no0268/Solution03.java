package com.leetcode.no0268;

public class Solution03 {

    public int missingNumber(int[] nums){

        int x = nums.length;

        for(int i = 0; i < nums.length; i++){
            x^= i ^ nums[i];
        }

        return x;

    }

}
