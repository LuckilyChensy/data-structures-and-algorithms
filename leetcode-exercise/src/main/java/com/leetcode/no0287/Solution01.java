package com.leetcode.no0287;

import java.util.Arrays;

public class Solution01 {

    public int findDuplicate(int[] nums) {

        Arrays.sort(nums);

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[ i+1 ]){
                return nums[i];
            }
        }
        return -1;
    }

}
