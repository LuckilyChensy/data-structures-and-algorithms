package com.leetcode.no1814;

public class Solution02 {

    public double myPow(double x, int n) {
        if(n == 0){ return 1.0;}
        if(x == 1.0){return x;}

        double result = 1.0;

        if(n<0){
            x=1/x;
            n=-n;
        }

        while(n!=0){
            if((n&1)==1){
                result *=x;
            }
            x*=x;
            n>>>=1;
        }

        return result;
    }

}
