package com.leetcode.no0046;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {

    public static List<List<Integer>> permute(int[] nums){
        //边界条件
        if(nums == null || nums.length == 0){ return null;}

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        boolean[] used = new boolean[nums.length];
        List<Integer> path = new ArrayList<>();

        dfs(nums,nums.length,0,path,used,result);

        return result;

    }

    private static void dfs(int[] nums, int length, int depth, List<Integer> path, boolean[] used, List<List<Integer>> result){
        if(depth == length){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i = 0; i <length; i++){
            if(!used[i]){
                path.add(nums[i]);
                used[i] = true;
                dfs(nums,length,depth+1,path,used,result);
                used[i] = false;
                path.remove(path.size() -1 );
            }
        }
    }

    public static void main(String[] args){
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }

}
