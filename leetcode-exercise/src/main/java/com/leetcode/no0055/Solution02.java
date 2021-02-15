package com.leetcode.no0055;

public class Solution02 {

    public boolean canJump(int[] nums) {

       //当前节点下可以到的最远点
        int max = 0;

        for(int i = 0 ; i < nums.length;i++){
            if(max<i){ return false; }
            max = Math.max(max,i+nums[i]);
        }

        return true;

    }

}
