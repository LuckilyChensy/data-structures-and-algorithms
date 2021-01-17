package com.leetcode.no0042;

public class Solution01 {

    public int waterCanBeTrap(int[] height){

        if(height == null || height.length == 0){
            return 0;
        }

        int n = height.length,leftMax = -1,rightMax = -1,water = 0 ;
        int[] d = new int[n];

        for(int i = 0; i < n; ++i){
            leftMax = Math.max(leftMax,height[i]);
            d[i] = leftMax;
        }

        for(int i=n-1;i>=0;--i){
            rightMax = Math.max(rightMax,height[i]);
            d[i] = Math.min(d[i],rightMax);
            water += (d[i] - height[i]);
        }

        return water;

    }
}
