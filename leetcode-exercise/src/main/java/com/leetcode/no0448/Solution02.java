package com.leetcode.no0448;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution02 {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        if(nums == null || nums.length == 0){ return Collections.emptyList(); }
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums.length; ++i){
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx] > 0){
                nums[idx] = -nums[idx];
            }
        }

        for(int i = 0; i < nums.length; ++i){
            if(nums[i] > 0){
                result.add(i+1);
            }
        }

        return result;
    }

}
