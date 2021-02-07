package com.leetcode.no0044;

public class Solution01 {
    public boolean isMatch(String s,String p){

        int pLength = p.length();
        int sLength = s.length();

        //dp[i][j] 表示 p 的前 i 个字符和 s 的前 j 个字符是否匹配。
        boolean[][] dp = new boolean[pLength+1][sLength+1];
        dp[0][0] = true;

        for(int i = 1; i <= pLength; i++){
            if(p.charAt(i-1)!='*'){
                break;
            }
            dp[i][0] = true;
        }

        for(int i = 1; i <= pLength; i++){
            for(int j = 1;j <= sLength; j++){
                if(p.charAt(i-1) == s.charAt(j-1)||p.charAt(i-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }else if(p.charAt(i-1) == '*'){
                    dp[i][j]=dp[i-1][j] | dp[i][j-1];
                }
            }
        }
        return dp[pLength][sLength];

    }
}
