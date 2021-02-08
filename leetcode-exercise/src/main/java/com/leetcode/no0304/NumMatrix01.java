package com.leetcode.no0304;

/**
 * 将二维矩阵视为一维数组的 m 行,为了找到区域和,只需要在区域中逐行累加
 */
class NumMatrix01 {

    private int[][] dp;

    public NumMatrix01(int[][] matrix) {

        if(matrix.length == 0 || matrix[0].length == 0){
            return;
        }

        dp = new int[matrix.length][matrix[0].length+1];

        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length; c++){
                dp[r][c+1] = dp[r][c] + matrix[r][c];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int row = row1 ; row < row2; row++){
            sum += dp[row][col2+1] - dp[row][col1];
        }
        return sum;
    }
}
