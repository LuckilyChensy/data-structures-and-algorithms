package com.leetcode.no0240;

public class Solution02 {
    public boolean searchMatrix(int[][] matrix, int target) {

        // 边界条件
        if(matrix == null || matrix.length == 0 ||matrix[0] == null || matrix[0].length == 0){
            return false;
        }
        // 长度
        int row = matrix.length;
        int col = matrix[0].length;
        // 索引值
        int i = 0;
        int j = col - 1;

        while( i < row && j >= 0){
            if(matrix[i][j] > target){
                --j;
            }else if(matrix[i][j] < target){
                ++i;
            }else{
                return true;
            }
        }
        return false;
    }
}
