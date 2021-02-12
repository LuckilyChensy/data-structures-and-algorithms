package com.leetcode.no1809;

public class Solution01 {

    public int[] spiralOrder(int[][] matrix) {

        // 处理边界条件
        if (matrix == null || matrix.length == 0) {
            return new int[]{0};
        }

        // 矩阵边界索引
        int left = 0;
        int right = matrix.length - 1;
        int top = 0;
        int bottom = matrix[0].length - 1;

        // 返回矩阵索引
        int index = 0;
        int[] result = new int[(right + 1) * (bottom + 1)];

        while (true) {
            // left -> right
            for (int i = 0; i <= right; i++) {
                result[index++] = matrix[top][i];
            }

            // top --> bottom
            if (++top > bottom) {
                break;
            }
            for (int i = top; i < bottom; i++) {
                result[index++] = matrix[i][right];
            }

            // right --> left
            if (--right < left) {
                break;
            }
            for (int i = right; i > left; i--) {
                result[index++] = matrix[bottom][i];
            }


            if (--bottom > top) {
                break;
            }
            for (int i = bottom; i > top; i--) {
                result[index++] = matrix[i][left];
            }

        }

        return result;
    }
}
