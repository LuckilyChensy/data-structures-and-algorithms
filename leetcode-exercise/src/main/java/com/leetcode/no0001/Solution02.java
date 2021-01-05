package com.leetcode.no0001;

public class Solution02 {

    public static int[] twoSum(int[] nums, int target){

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            int k = target - nums[i];

            for(int j = i+1; j < nums.length; j++){
               if(k == nums[j]){
                   result[0] = i;
                   result[1] = j;
                   break;
               }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}
