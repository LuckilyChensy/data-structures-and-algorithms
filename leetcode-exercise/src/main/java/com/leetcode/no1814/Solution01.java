package com.leetcode.no1814;

public class Solution01 {

    public double myPow(double x, int n) {

         if( x == 1.0){ return x; }

         double result = 1.0;

         if(n < 0){
             x=1/x;
             n=-n;
         }

         while(n!=0){
             result *= x;
             n--;
         }

         return result;

    }

}
