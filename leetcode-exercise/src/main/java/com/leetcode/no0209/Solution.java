package com.leetcode.no0209;

/**
 * @Author： bugest
 * @Description: 暴力解法
 * @Date:Created in 17:58 2021/5/4
 * @Modified By:
 */
public class Solution {

    public int minSubArrayLen(int target,int[] nums){

        // 记录最短子串, 注意子串不存在时不要返回该值
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length;i++){
            // 每次循环初始化的参数
            int j = i;
            int sum = 0;

            while(j < nums.length){
                sum += nums[j];
                if(sum >= target){
                    break;
                }
                j++;
            }

            if(sum >= target){
                min = Math.min(min,(j-i+1));
            }

        }

        return min>nums.length? 0 : min;
    }
}
