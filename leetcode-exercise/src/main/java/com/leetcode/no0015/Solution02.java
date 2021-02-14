package com.leetcode.no0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution02 {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int k = 0; k < nums.length-2; k++){

            if(nums[k] > 0){ break ; }

            if( k > 0 && nums[k]==nums[k-1]){ continue; }

            int left = k+1;
            int right = nums.length - 1;

            while(left < right){

                int sum = nums[k] + nums[left] + nums[right];

                if(sum < 0){
                    while(left < right && nums[left] == nums[++left]);
                }else if(sum > 0){
                    while(left < right && nums[right] == nums[--right]);
                }else{
                    result.add(new ArrayList<>(Arrays.asList(nums[k],nums[left],nums[right])));
                    while(left < right && nums[left] == nums[++left]);
                    while(left < right && nums[right] == nums[--right]);
                }
            }
        }
        return result;
    }

}
