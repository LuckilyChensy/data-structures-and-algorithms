package com.leetcode.no0509;

public class Solution01 {
    public int fib(int n) {
        if(n <= 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }
}
