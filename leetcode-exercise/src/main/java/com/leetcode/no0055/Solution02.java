package com.leetcode.no0055;

public class Solution02 {
    public boolean canJump(int[] nums) {

        // 遍历每个节点后，能够着的最远的点
        int futurestPoint = 0;

        for(int i = 0; i < nums.length; i++){
            if(i > futurestPoint){
                return false;
            }else{
                futurestPoint = Math.max(nums[i]+i,futurestPoint);
            }
        }

        return true;
    }
}
