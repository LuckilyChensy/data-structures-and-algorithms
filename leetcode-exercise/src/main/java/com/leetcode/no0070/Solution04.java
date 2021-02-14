package com.leetcode.no0070;

/*
    爬第n阶楼梯的方法数量，等于 2 部分之和

    爬上 n-1 阶楼梯的方法数量。因为再爬 1 阶就能到第 n 阶
    爬上 n-2 阶楼梯的方法数量，因为再爬 2 阶就能到第 n 阶
    所以我们得到公式 dp[n] = dp[n-1] + dp[n-2]
    同时需要初始化 dp[0]=1 dp[0]=1
    时间复杂度：O(n)
*/

public class Solution04 {
    public int climbStairs(int n) {

        // 处理边界条件 保证 dp 的size>=2
        if(n <=2){
            return n;
        }

        // 与 台阶 的实际数据相对应
        int[] dp = new int[n+1];

        // 起始状态
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++){
            // 所有可能到达 dp[i] 的方式为
            // dp[i-1] 往前一个台阶
            // dp[i-2] 往前两个台阶
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
