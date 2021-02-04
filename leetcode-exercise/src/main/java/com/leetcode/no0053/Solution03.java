package com.leetcode.no0053;

public class Solution03 {

    // Times : O(n) Space: O(1)

    public int maxSubArray(int[] nums){

       int pre = 0;
       int maxAns = nums[0];

       for(int x:nums){
           pre = Math.max(pre+x,x);
           maxAns=Math.max(maxAns,pre);
       }

       return maxAns;

    }

}
