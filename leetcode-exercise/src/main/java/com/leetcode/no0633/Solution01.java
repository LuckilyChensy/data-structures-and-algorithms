package com.leetcode.no0633;

public class Solution01 {
    // 判断是否为整数次幂
    public boolean isSquare(int num){
        int n = (int)Math.sqrt(num);    // 如果非整数被取整,则重新平方后无法相等
        return n * n == num;
    }

    public boolean judgeSquareSum(int c) {
        int n = (int)Math.sqrt(c);
        for(int i = 0; i <= n; i++){
            if(isSquare(c - n*n)){
                return false;
            }
        }
        return false;
    }

}
