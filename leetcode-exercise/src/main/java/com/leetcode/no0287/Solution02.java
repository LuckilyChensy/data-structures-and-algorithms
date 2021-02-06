package com.leetcode.no0287;

public class Solution02 {

    public int findDuplicate(int[] nums) {

        for(int i = 0 ; i < nums.length ; i++){
            while(i != nums[i]){
                if(nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[i] = temp;
            }
        }
        return -1;
    }

}
