package com.leetcode.no0739;

public class Solution01 {

    public int[] dailyTemperatures(int[] T) {

        int n = T.length;

        int[] result = new int[n];

        for(int i = 0; i < n; i++){

            int j = i + 1;

            while(j < n && T[j] <= T[i] ){
                ++j;
            }

            if(j < n){
                result[i] = j - i;
            }
//            else{ result[i] = 0; }

        }

        return result;
    }
}
