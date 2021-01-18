package com.leetcode.no0509;

public class Solution03 {

    public int fib(int n){
        if(n <=0 ){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        int first = 0;
        int second = 1;

        for(int i = 2; i <= n; i++){
            int third = first - second;
            first = second;
            second = third;
        }

        return second;

    }
}
