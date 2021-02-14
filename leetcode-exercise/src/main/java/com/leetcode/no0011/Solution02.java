package com.leetcode.no0011;

public class Solution02 {

    public int maxArea(int[] height){

        int maxContainer = Integer.MIN_VALUE;

        int left = 0;
        int right = height.length - 1;

        while(left < right){
            maxContainer = height[left] < height[right]?
                    Math.max((right-left)*height[left++],maxContainer):
                    Math.max((right-left)*height[right--],maxContainer);
        }

        return maxContainer;

    }
}
