package com.leetcode.no0091;

public class Solution01 {

    public int numDecodings(String s){
        // 处理边界情况
        if(s.length() == 0 || s == null){
            return 0;
        }

        char[] chars = s.toCharArray();
        int n = chars.length;

        // 索引表示截止当前位置可能出现的编码方法总数
        int[] dp = new int[n+1];
        dp[0] = 1;

        for(int i = 1; i <= n; i++){
            dp[i] = 0;
            // 处理截止当前 i 位置，且假设已知 dp[i-1] dp[i-2] 的情况
            // 注意对应的字符串下标是 i - 1

            // 处理字符 <= 10 的情况
            int t = chars[i-1] - '0';
            if(t >= 1 && t<=9){
                dp[i] = dp[i-1];
            }

            // 处理字符在 10 & 26 之间的情况
            if(i>=2){
                t = chars[i-2]*10 + chars[i-1];
                if( t >= 10 && t <= 26){
                    dp[i] = dp[i-2];
                }
            }

        }

        return dp[n];
    }
}
