package com.leetcode.no0018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution01 {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();

        // 边界条件
        if(nums == null || nums.length < 4){
            return result;
        }

        Arrays.sort(nums);

        for(int p = nums.length - 1; p >= 3; --p){

            if(4*nums[p] < target){ break; }

            for(int k = p - 1; k >=2; --k){
                if(3*nums[k] + nums[p] < target){ break; }
                int newTarget = target - nums[k] - nums[p];
                int i = 0;
                int j = k - 1;
                while(i < j){
                    if(nums[i] + nums[j] == newTarget){
                        result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[p]));
                        while(i < j && nums[i+1] == nums[i]) {++i;}
                        while(i < j && nums[j-1] == nums[j]) {--j;}
                        ++i;
                        --j;
                    }else if(nums[i] + nums[j] < newTarget){
                        ++i;
                    }else{
                        --j;
                    }
                }
                while(k >=2 && nums[k-1] == nums[k]){--k;}
            }
            while(p>=3 && nums[p-1] == nums[p]){--p;}
        }
        return result;
    }

}
