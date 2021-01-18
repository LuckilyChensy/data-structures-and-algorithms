package com.leetcode.no0078;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {

    public List<List<Integer>> subsets(int[] nums) {

        if(nums == null || nums.length == 0 ){
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> elem = new ArrayList<>();

        subsetshelp(nums,0,elem,result);

        return result;
    }

    private void subsetshelp(int[] nums,int start,List<Integer> elem,List<List<Integer>> result){

        result.add(new ArrayList<>(elem));

        for(int i = start; i <nums.length; i++){
            elem.add(nums[i]);
            subsetshelp(nums,i+1,elem,result);
            elem.remove(elem.size() - 1);
        }

    }

}
