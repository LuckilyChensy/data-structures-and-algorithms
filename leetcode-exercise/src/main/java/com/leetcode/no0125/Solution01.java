package com.leetcode.no0125;

public class Solution01 {

    // Time O(n) Space O(n)
    public boolean isPalindrome(String s) {

        // 存放纯字母字符串
        StringBuffer pureCharString = new StringBuffer();
        int length = s.length();

        for(int i = 0; i < length; i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                pureCharString.append(Character.toLowerCase(ch));
            }
        }

        StringBuffer pureCharString_reverse = new StringBuffer(pureCharString).reverse();
        return pureCharString_reverse.toString().equals(pureCharString.toString());

    }

}
