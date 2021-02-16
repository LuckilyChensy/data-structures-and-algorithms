package com.leetcode.no0256;

public class Solution01 {

    public int minCost(int[][] costs) {

        // 处理边界条件
        int row = costs.length;
        int col = 3;    // 依据实际定义

        if(row == 0){ return 0; }
        // 定义状态
        // 索引表示第 i 栋房子, 并且使用的颜色, 保持索引与实际计数一致
        int[][] dp = new int[row+1][col];

        // 初始条件
        dp[0][0] = dp[0][1] = dp[0][2] =0;

        for(int i = 1; i <= row ; i++){
            // j 代表 i-1 房子的颜色
            for(int j = 0; j < 3; j++){
                // 数组在初始化时为 0 , 主动赋值防止风险
                dp[i][j] = Integer.MAX_VALUE;
                // 构建转移方程
                // k 代表 i-2 房子的颜色
                for(int k = 0; k <3; k++){

                    //相邻的房子不能是相同的颜色
                    if(j == k){ continue; }

                    dp[i][j] = Math.min(costs[i-1][j]+dp[i-1][k],dp[i][j]);

                }

            }
        }

        return Math.min(dp[row][0],Math.min(dp[row][1],dp[row][2]));

    }

}
