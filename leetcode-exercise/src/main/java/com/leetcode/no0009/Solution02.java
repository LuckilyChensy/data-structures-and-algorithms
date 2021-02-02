package com.leetcode.no0009;

public class Solution02 {

    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int tmp = x;
        long y = 0;

        while(tmp != 0){
            int num = tmp % 10;
            y = y * 10 + num;
            tmp = tmp / 10;
        }

        return y == x;
    }
}
