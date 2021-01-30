package com.leetcode.no0371;

public class Solution01 {

    public int  getSum(int a,int b){
        while(b!=0){
            int sum = (a^b);
            int carry  = (a&b)<<1;
            a = sum;
            b = carry;
        }
        return a;
    }

}
