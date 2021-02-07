package com.leetcode.no0438;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {
    // 辅助函数,判断两个字符串数组是否相等
    private boolean equals(char[] sc,char[] pc){
        for(int i = 0; i < sc.length; ++i){
            if(sc[i]!=pc[i]){
                return false;
            }
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        // 边界处理
        if(s == null || p == null || s.length() < p.length()){ return null; }

        int sLength = s.length();
        int pLength = p.length();

        char[] pc = new char[26];
        char[] sc = new char[26];

        for(int i = 0; i < pLength; ++i){
            pc[p.charAt(i) - 'a']++;
            sc[s.charAt(i) - 'a']++;
        }

        if(equals(sc,pc)){
            result.add(0);
        }

        for(int i = pLength; i< sLength;++i){
            sc[s.charAt(i) - 'a']++;
            sc[s.charAt(i-pLength) - 'a']--;
            if(equals(sc,pc)){
                result.add(i - pLength + 1);
            }
        }

        return result;

    }
}
