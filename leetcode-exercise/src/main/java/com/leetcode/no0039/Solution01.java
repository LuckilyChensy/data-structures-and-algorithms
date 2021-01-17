package com.leetcode.no0039;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> elem = new ArrayList<>();
        combSum(candidates,target,0,elem,result);
        return result;
    }

    private void combSum(int[] nums, int target, int start,List<Integer> elem,List<List<Integer>> result){

        if(target == 0){
            result.add(new ArrayList<>(elem));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = start; i <nums.length; i++){
            elem.add(nums[i]);
            combSum(nums,target-nums[i],i,elem,result);
            elem.remove(elem.size()-1);
        }
    }

}
