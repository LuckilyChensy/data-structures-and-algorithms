package com.leetcode.no0009;

public class  Solution01 {

    public boolean isPalindrome(int x) {
        // 将数字转成字符串
        String str = String.valueOf(x);

        int i = 0;
        int j = str.length() - 1;

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            ++i;
            --j;
        }

        return true;
    }

}
