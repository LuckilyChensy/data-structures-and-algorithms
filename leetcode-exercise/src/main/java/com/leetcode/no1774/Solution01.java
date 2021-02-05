package com.leetcode.no1774;

import java.util.Arrays;

public class Solution01 {

    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 1; i++){
            if(nums[i+1] == nums[i]){
                return nums[i];
            }
        }
        return -1;
    }

}
