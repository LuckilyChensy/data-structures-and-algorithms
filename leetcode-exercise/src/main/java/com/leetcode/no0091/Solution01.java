package com.leetcode.no0091;

public class Solution01 {

    public int numDecodings(String s){
        // 处理边界条件
        if(s == null){ return 0; }

        // 初始化参数
        char[] chars = s.toCharArray();
        int n = chars.length;

        // 定义状态 索引表示截止目标位置 i 一共有多少种解码方法 dp[i]
        int[] dp = new int[n+1];
        dp[0] = 1;

        for(int i = 1; i <= n; i++){

            dp[i] = 0;
            int temp = chars[i-1] - '0';

            // 一位解码的情况
            if(temp>=1 && temp<=9){
                dp[i] += dp[i-1];
            }

            // 是否能使用2位编码
            if(i>=2){
                temp = (chars[i-2]-'0')*10 + (chars[i-1] - '0');
                if(temp >= 10 && temp <=26){
                    dp[i] += dp[i-2];
                }
            }

        }

        return dp[n];
    }
}
