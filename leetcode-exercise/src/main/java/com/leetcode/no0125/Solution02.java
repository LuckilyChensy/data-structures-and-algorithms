package com.leetcode.no0125;

public class Solution02 {

    // Time O(n) Space O(n)
    public boolean isPalindrome(String s) {

        StringBuffer pureCharStr = new StringBuffer();
        int length = s.length();

        for(int i = 0; i < length; i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                pureCharStr.append(Character.toLowerCase(ch));
            }
        }

        int pureString_length = pureCharStr.length();
        int left = 0;
        int right = pureString_length - 1;

        while(left < right){
            if(Character.toLowerCase(pureCharStr.charAt(left)) != Character.toLowerCase(pureCharStr.charAt(right))){
                return false;
            }

            ++left;
            --right;
        }

        return true;

    }

}
