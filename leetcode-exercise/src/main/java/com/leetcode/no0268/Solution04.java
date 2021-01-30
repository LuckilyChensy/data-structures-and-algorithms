package com.leetcode.no0268;

public class Solution04 {

    public int missingNumber(int[] nums){

        int n = nums.length;
        int[] arr = new int[n+1];

        for(int v: nums){
            arr[v] = v;
        }
        for(int i = 1; i< n+1; i++){
            if(arr[i] == 0){
                return i;
            }
        }

        return 0;

    }

}
