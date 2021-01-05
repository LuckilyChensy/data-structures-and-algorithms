package com.leetcode.no0647;

public class Solution01 {

    public boolean isPalindrome(String s){

        if(s == null || s.length() == 0){
            return true;
        }

        int i = 0 ;
        int j = s.length() - 1;

        for(; i<j;++i,--j){
            // 跳过非字母，数字
            while(i < j && !isAlphanumeric(s.charAt(i))){
                ++i;
            }
            // 跳过非字母，数字
            while(i<j && !isAlphanumeric(s.charAt(j))){
                --j;
            }

            if( i<j && !isEqualIgnoreCase(s.charAt(i),s.charAt(j))){
                return false;
            }

        }
        return true;
    }

    public boolean isAlphanumeric(char c){
        return (c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9');
    }

    private boolean isEqualIgnoreCase(char a,char b){

        if(a >= 'A' && a <= 'Z'){
            a += 32;
        }

        if( b >= 'A' && b<='Z'){
            b += 32;
        }

        return a==b;
    }
}
