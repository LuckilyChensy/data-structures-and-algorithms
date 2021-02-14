package com.leetcode.no0283;

public class Solution02 {

    // 冒泡的思维,将目标数据不断上升
    public void moveZeroes(int[] nums){

        int i = 0;  // 用于遍历所有位置
        int j = 0;  // 用于指向0位置
        int temp = 0;

        // 若起始位不为零,i,j同步移动,原位交换,会遍历到第一次出现零的地方
        while(i < nums.length){
            if(nums[i]!=0){
                temp = nums[i];
                nums[i] =nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }

    }

}
