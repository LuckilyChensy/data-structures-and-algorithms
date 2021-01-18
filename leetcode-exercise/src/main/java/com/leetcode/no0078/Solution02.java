package com.leetcode.no0078;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {

    public List<List<Integer>> subsets(int[] nums) {
        if(nums == null || nums.length == 0){
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;
        int N = (int)Math.pow(2,n);

        for(int i = 0 ; i < N ; i++){
            List<Integer> elem = new ArrayList<>();
            for(int j =0; j < n; ++j){
                if(((i >> j) & 1) == 1){
                    elem.add(nums[j]);
                }
            }
            result.add(elem);
        }

        return result;
    }

}
