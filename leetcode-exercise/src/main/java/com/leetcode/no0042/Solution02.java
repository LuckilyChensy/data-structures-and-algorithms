package com.leetcode.no0042;

public class Solution02 {

    public int waterCanBeTrap(int[] height){
        // 处理边界情况
        if(height == null || height.length == 0){
            return 0;
        }

        int leftMax = -1,rightMax = -1,water = 0;
        int i = 0,j = height.length -1;

        while(i < j){
            leftMax = Math.max(leftMax,height[i]);
            rightMax = Math.max(rightMax,height[j]);
            if(leftMax < rightMax){
                water += (leftMax - height[i++]);
            }else{
                water += (rightMax - height[j--]);
            }
        }

        return water;

    }
}
