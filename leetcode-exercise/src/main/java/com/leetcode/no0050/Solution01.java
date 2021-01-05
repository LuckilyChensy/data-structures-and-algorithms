package com.leetcode.no0050;

public class Solution01 {
    public double myPow(double x, int n) {
        double result = 1;

        long N = Math.abs((long)n);

        for(int i = 0; i < N; i++){
            result *= x;
        }

        return n < 0 ? 1/result: result;
    }
}
