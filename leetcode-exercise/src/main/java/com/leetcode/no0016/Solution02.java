package com.leetcode.no0016;

import java.util.Arrays;

public class Solution02 {
    public int threeSumClosest(int[] nums, int target) {

        int result = 0;
        int min = Integer.MAX_VALUE;

        Arrays.sort(nums);

        for(int k = nums.length - 1; k >= 2; --k){
            int i = 0;
            int j = k-1;
            while(i < j){
                int sum = nums[i] + nums[j] + nums[k];

                if( sum == target){
                    return sum;
                }else if(sum < target){
                    ++i;
                }else{
                    --j;
                }

                int diff = Math.abs(target - sum);

                if(diff < min){
                    result = sum;
                    min = diff;
                }
            }
        }

        return result;
    }
}
