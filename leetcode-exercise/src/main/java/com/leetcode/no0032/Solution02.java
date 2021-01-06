package com.leetcode.no0032;

public class Solution02 {

    public int maxLengthOfValidParenthesesDP(String s){

        if(s == null || s.length() == 0){
            return 0;
        }

        int n = s.length();
        int left = 0;
        int max = 0;
        int[] d = new int[n];

        for(int i = 0; i < n; ++i){
            if(s.charAt(i) == '('){
                ++left;
           }else if(left > 0){
            d[i] = d[i-1] + 2;
            d[i] += (i-d[i]) >= 0?d[i-d[i]]:0;
            max = Math.max(max,d[i]);
            --left;
        }
      }
        return max;

    }

}
