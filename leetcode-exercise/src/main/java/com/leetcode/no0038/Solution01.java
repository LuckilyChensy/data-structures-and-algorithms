package com.leetcode.no0038;

public class Solution01 {
    public String countAndSay(int n) {

        if(n < 1){ return null; }

        String s = "1";

        for(int i=1; i < n; ++i){
            int cnt = 1;
            StringBuilder stringBuilder = new StringBuilder();
            for(int p = 0; p < s.length(); ++p){
                if(p+1 < s.length() && s.charAt(p) == s.charAt(p+1)){
                    ++cnt;
                }else{
                    stringBuilder.append(cnt).append(s.charAt(p));
                    cnt = 1;
                }
            }
            s = stringBuilder.toString();
        }
        return s;
    }
}
