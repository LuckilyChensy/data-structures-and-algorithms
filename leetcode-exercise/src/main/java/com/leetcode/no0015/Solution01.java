package com.leetcode.no0015;

import java.util.*;

public class Solution01 {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    List<Integer> elem = Arrays.asList(nums[i],nums[j],nums[k]);
                    if(set.contains(elem)){ continue; }
                    set.add(elem);
                    result.add(elem);
                }
            }
        }
        return result;
    }
}
