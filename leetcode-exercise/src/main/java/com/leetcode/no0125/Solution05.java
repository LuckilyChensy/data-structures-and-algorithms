package com.leetcode.no0125;

public class Solution05 {

    public static boolean isPalindrome(String s) {

        StringBuffer oriStrBuffer = new StringBuffer();
        int length = s.length();

        for(int i = 0; i < length; i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                oriStrBuffer.append(Character.toLowerCase(c));
            }
        }

        StringBuffer reverse_s = new StringBuffer(oriStrBuffer).reverse();

        return oriStrBuffer.toString().equals(reverse_s.toString());

    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
