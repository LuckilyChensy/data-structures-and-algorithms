package com.leetcode.no0125;

public class Solution04 {

    public boolean isPalindrome(String s) {

        if(s == null || s.length() == 0){
            return true;
        }

        int left = 0;
        int right = s.length() - 1;
        char[] ch  = s.toCharArray();

        while(left < right){
            while(left < right && !isAlphanumeric(ch[left]) ){
                ++left;
            }
            while(left < right && !isAlphanumeric(ch[right])){
                --right;
            }
            if(left<right && !isEqualIgnoreCase(ch[left],ch[right])){
                return false;
            }
            ++left;
            --right;
        }

        return true;
    }

    private boolean isAlphanumeric(char c){return (c<='z' && c>='a')||(c>='A'&& c<='Z')||(c>='0'&& c<='9');}
    private boolean isEqualIgnoreCase(char a,char b){
        if(a<='Z' && a>='A'){a += 32;}
        if(b<='Z' && b>='A'){b += 32;}
        return a == b;
    }

}
