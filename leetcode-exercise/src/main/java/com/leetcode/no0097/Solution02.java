package com.leetcode.no0097;

public class Solution02 {

    public boolean isInterleave(String s1,String s2,String s3){

        if(s1 == null || s2 == null || s3 == null){ return false; }

        int n1 = s1.length();
        int n2 = s2.length();
        int n3 = s3.length();

        if(n1 + n2 != n3){ return false; }
        boolean[][][] d = new boolean[n1+1][n2+1][n3+1];
        d[0][0][0] = true;

        for(int i = 1; i <= n1; ++i){
            d[i][0][i] = d[i-1][0][i-1] && s1.charAt(i-1) == s3.charAt(i-1);
        }

        for(int j = 1; j <= n2; ++j){
            d[0][j][j] = d[0][j-1][j-1] && s2.charAt(j-1) == s3.charAt(j-1);
        }

        for(int i=1; i<=n1;++i){
            for(int j=1;j<=n2;++j){
                int k = i + j;
                d[i][j][k] = d[i-1][j][k-1] && s1.charAt(i-1) == s3.charAt(k-1)||
                (d[i][j-1][k-1] && s2.charAt(j-1) == s3.charAt(k-1));
            }
        }

        return d[n1][n2][n3];

    }

}
