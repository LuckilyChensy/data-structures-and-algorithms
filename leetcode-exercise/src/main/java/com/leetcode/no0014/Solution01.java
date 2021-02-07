package com.leetcode.no0014;

public class Solution01 {
    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0){
            return "";
        }

        String first = strs[0];

        for(int i = 0; i < first.length();++i){
            char c = first.charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=c){
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
}
