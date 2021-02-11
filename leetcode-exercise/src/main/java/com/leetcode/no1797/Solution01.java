package com.leetcode.no1797;

public class Solution01 {

    // x 基数 , n 次方
    public double myPow(double x, int n){

        if( x == 0){ return 0; }

        double res = 1.0;

        if( n < 0){
            x = 1/x;
            n -= n;
        }

        while( n > 0){
            if((n&1)==1){
                res *= x;
            }

            x*=x;
            n>>=1;
        }

        return res;
    }

}
