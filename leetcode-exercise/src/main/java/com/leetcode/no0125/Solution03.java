package com.leetcode.no0125;

public class Solution03 {

    // Time O(n) Space O(1)
    public boolean isPalindrome(String s) {

        int n = s.length();
        int left = 0;
        int right = n - 1;

        while(left < right){

            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                ++left;
            }

            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                --right;
            }

            if(left < right){
                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                    return false;
                }
                ++left;
                --right;
            }
        }

        return true;

    }

}