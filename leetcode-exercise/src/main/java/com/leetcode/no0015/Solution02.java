package com.leetcode.no0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution02 {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int k = nums.length - 1; k>=2; --k){

            if(nums[k] < 0){ break ; }

            int target = -nums[k];
            int i = 0;
            int j = k - 1;

            while(i < j){

                if(nums[i] + nums[j] == target){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(i < j && nums[j+1] == nums[i]){ ++i; }
                    while(i < j && nums[j-1] == nums[j]){ --j; }
                    ++i;
                    --j;
                }

            }
            while(k >=2 && nums[k-1] == nums[k]){ --k; }
        }

        return result;
    }

}
