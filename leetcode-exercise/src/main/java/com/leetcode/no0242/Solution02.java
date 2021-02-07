package com.leetcode.no0242;

public class Solution02 {

    public boolean isAnagram(String s, String t) {

        if(s == null || t == null || s.length() != t.length()){
            return false;
        }

        int[] counts = new int[26];

        // 将字母对应的 ASCII 码做为对应的索引
        for(int i = 0; i < s.length(); i++){
            counts[s.charAt(i)-'a']++;
            counts[t.charAt(i)-'a']--;
        }

        for(int i = 0; i < 26;++i){
            if(counts[i] != 0){
                return false;
            }
        }

        return true;

    }

}
