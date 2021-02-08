package com.leetcode.no0217;

public class Soliution02 {

    public boolean containsDuplicate(int[] nums) {

        if( nums == null || nums.length == 0){
            return false;
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }

        return false;

    }

}
