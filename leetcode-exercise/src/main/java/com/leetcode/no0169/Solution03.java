package com.leetcode.no0169;

public class Solution03 {

    public int majorityElement(int[] nums) {
       int cand_num = nums[0];
       int count = 1;

       for(int i = 1; i<nums.length;++i){
           if(cand_num == nums[i]) {
               count++;
           }else if(--count == 0){
               cand_num = nums[i];
               count = 1;
           }
       }
       return cand_num;
    }

}
