package com.leetcode.no0064;

public class Solution01 {

    public int minPathSum(int[][] grid){

        if(grid.length == 0 || grid == null || grid[0] == null || grid[0].length == 0){
            return 0;
        }

        // 行数
        int row = grid.length;
        // 列数
        int col = grid[0].length;

        // 压缩空间写法, 只与前面两行有关
        int[][] dp = new int[2][col];

        // 复用数组空间标记
        int old = 1;
        int now = 0;
        int t1;
        int t2;

        for(int i = 0; i < row ; ++i){

            old = now;
            now = 1 -now;

            for(int j = 0; j < col; ++j){

                if( i == 0 &&  j == 0){
                    dp[now][j] = grid[i][j];
                    continue;
                }

                dp[now][j] = grid[i][j];

                if(i > 0){
                    t1 = dp[old][j];
                }else{
                    t1 = Integer.MAX_VALUE;
                }

                if(j > 0){
                    t2 = dp[now][j-1];
                }else{
                    t2 = Integer.MAX_VALUE;
                }

                if(t1 < t2){
                    dp[now][j] += t1;
                }else{
                    dp[now][j] += t2;
                }
            }
        }
        return dp[now][col - 1];
    }
}
