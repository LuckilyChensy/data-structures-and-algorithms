package com.leetcode.no0001;

import java.util.HashMap;
import java.util.Map;

public class Solution03 {

    public static int[] twoSum(int[] nums, int target){

        Map<Integer,Integer> result = new HashMap<Integer,Integer>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if(result.containsKey(complement)){
                return new int[]{result.get(complement),i};
            }

            result.put(nums[i],i);

        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}
