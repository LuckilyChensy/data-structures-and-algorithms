package com.leetcode.no0647;

public class Solution04 {

    public int countSubstrings(String s){

        if(s == null || s.length() == 0){
            return 0;
        }

        int n = s.length();
        int count = 0;

        boolean[][] d = new boolean[n][n];

        for(int i = n - 1; i >= 0; i--){
            for(int j = i; j < n; j++){

                if( i == j){
                    d[i][j] = true;
                }else if(i+1 == j){
                    d[j][j] = s.charAt(i) == s.charAt(j);
                }else {
                    d[i][j] = s.charAt(i) == s.charAt(j)&&d[i+1][j-1];
                }

                if(d[i][j]){
                    ++count;
                }
            }
        }

        return count;
    }

}
