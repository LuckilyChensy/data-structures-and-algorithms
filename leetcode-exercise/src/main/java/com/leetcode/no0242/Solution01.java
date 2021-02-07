package com.leetcode.no0242;

import java.util.Arrays;

public class Solution01 {

    public boolean isAnagram(String s, String t) {

        if(s == null || t == null || s.length() != t.length()){ return false; }

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        for(int i=0; i < sc.length; i++){
            if(sc[i] != tc[i]){
                return false;
            }
        }

        return true;
    }

}
