package com.leetcode.no0001;

public class Solution01 {

    public static int[] twoSum(int[] arr, int target){

        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++){
               if(arr[i] + arr[j] == target){
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
