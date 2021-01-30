package com.leetcode.no0268;

import java.util.Arrays;

public class Solution02 {

    public int missingNumber(int[] nums){

        Arrays.sort(nums);

        int n = nums.length;

        for(int i  = 0; i < n ;i++){
            if( nums[i] != i){
                return i;
            }
        }

        return n;

    }

}
