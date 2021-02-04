package com.leetcode.no0053;

public class Solution02 {

    /**
     * Times : O(n) Space: O(1)
     * 从第 i 个元素起，前一段累计出负数的对后续的最值没有帮助，因此可以去掉
     * */
    public int maxSubArray(int[] nums){

        int max = Integer.MIN_VALUE;
        int cur = 0;

        for(int i = 0; i < nums.length; i++){
            cur  = cur<0? nums[i]:(cur+nums[i]);
            max = Math.max(cur,max);
        }

        return max;
    }

}
