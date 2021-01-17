package com.leetcode.no0048;

public class Solution01 {

    public void rotate(int[][] matrix) {

        if(matrix == null || matrix.length ==0 || matrix[0] == null || matrix[0].length == 0){
            return ;
        }

        int n = matrix.length;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for(int i = 0; i < n;i++){
            for(int j = 0; j < n/2; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = tmp;
            }
        }
    }

}
