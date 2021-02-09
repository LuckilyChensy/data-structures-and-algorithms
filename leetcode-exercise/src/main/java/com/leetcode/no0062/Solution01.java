package com.leetcode.no0062;

public class Solution01 {

    public int uniquePaths(int m, int n) {
        // 下一个状态和前置状态之间的关系
        int[][] dp = new int[m][n];

        // 自底向上累计不同状态值
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                // 单独一行 或者 单独一列 本质上路径只有一条，所以关系使用或
                if(i == 0 || j == 0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }

        return dp[m-1][n-1];
    }

}
