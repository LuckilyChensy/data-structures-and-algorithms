package com.leetcode.no0739;

public class Solution03 {

    public int[] dailyTemperatures(int[] T) {

        int n = T.length;

        int[] result = new int[n];

        for(int i = n - 2; i >= 0; --i){

            int j = i + 1;

            while(T[j] <= T[i] && result[j] != 0){
                j += result[j];
            }

            if(T[j] > T[i]){
                result[i] = j - i;
            }

        }

        return result;

    }

}
