package com.leetcode.no0268;

public class Solution01 {

    public int missingNumber(int[] nums) {

       int n = nums.length;
       int count = 0;

       for(int v : nums){
           count += v;
       }

        return n*(n+1)/2-count;
    }

}
