package com.leetcode.no0240;

public class Solution02 {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length ==0){
            return true;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0 ;
        int j = n - 1;

        while(i < m && j >= 0){
            if(target < matrix[i][j]){
                --j;
            }else if (target > matrix[i][j]){
                ++i;
            }else{
                return true;
            }
        }

        return false;
    }
}
