package com.leetcode.no0011;

public class Solution01 {
    public int maxArea(int[] height) {

        int max = 0;
        int i = 0;
        int j = height.length - 1;

        while(i < j){
            int cur = Math.min(height[i],height[j])*(j-i);
            max = Math.max(max,cur);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }

        return max;

    }
}
