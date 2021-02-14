package com.leetcode.no0011;

/**
 * 暴力法求解
 */
public class Solution01 {

    public int maxArea(int[] height) {

        int maxContainer = Integer.MIN_VALUE;

        for(int i = 0; i< height.length; i++){
            for(int j = i+1; j < height.length; j++){
                maxContainer = Math.max(maxContainer,Math.min(height[i],height[j])*(j-i));
            }
        }
        return maxContainer;
    }

}
