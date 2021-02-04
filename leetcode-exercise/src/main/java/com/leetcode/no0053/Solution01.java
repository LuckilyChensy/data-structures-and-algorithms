package com.leetcode.no0053;

/** 暴力解法
 *  穷举所有子空间
 */
public class Solution01 {

    public int maxSubArray(int[] nums) {

        int maxGlobal = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            int sum = nums[i];
            int max = sum;
            for(int j = i + 1; j < nums.length; j++){
                sum += nums[j];
                max = Math.max(max,sum);        // 记录第 i 个元素起出现过的最大值
            }
            if(max > maxGlobal){
                maxGlobal = max;
            }
        }

        return maxGlobal;
    }

}
