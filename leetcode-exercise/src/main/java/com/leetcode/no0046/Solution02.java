package com.leetcode.no0046;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution02 {

    private static void permuteRec(List<Integer> nums,int start,List<List<Integer>> result){
        if(start == nums.size()){
            result.add(new ArrayList<Integer>(nums));
        }else{
            for(int i = start; i<nums.size();++i){
                Collections.swap(nums,i,start);
                permuteRec(nums,start+1,result);
                Collections.swap(nums,i,start);
            }
        }
    }

    public static List<List<Integer>> permute(int[] nums){

        if(nums == null || nums.length == 0){
            return new ArrayList<>();
        }

        List<List<Integer>> result =new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        for(int num:nums){
            list.add(num);
        }

        permuteRec(list,0,result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3};
        System.out.println(permute(nums));
    }
}
