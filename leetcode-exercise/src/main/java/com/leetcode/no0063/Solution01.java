package com.leetcode.no0063;

public class Solution01 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // 处理边界条件
        if(obstacleGrid == null || obstacleGrid.length == 0){
            return 0;
        }

        // 行数
        int row = obstacleGrid.length;
        // 列数
        int col = obstacleGrid[0].length;

        // 状态变量
        int[][] dp = new int[row][col];

        for(int i = 0 ; i < row; i++){
            for(int j = 0; j < col; j++){

                if(obstacleGrid[i][j] == 1){
                    // 状态初始化,起点即障碍的情况
                    dp[i][j] = 0;
                }else if(i == 0 && j == 0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = 0;
                    if(i-1>=0){
                        dp[i][j] += dp[i-1][j];
                    }
                    if(j-1>=0){
                        dp[i][j] += dp[i][j-1];
                    }
                }
            }
        }

        return dp[row-1][col-1];
    }
}
