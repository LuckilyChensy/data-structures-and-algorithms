package com.leetcode.no0013;

public class Solution01 {

    private static final int[] mapping = new int[256];

    static{
        mapping['I'] = 1;
        mapping['V'] = 5;
        mapping['X'] = 10;
        mapping['L'] = 50;
        mapping['C'] = 100;
        mapping['D'] = 500;
        mapping['M'] = 1000;
    }

    public int romanToInt(String s) {

        int sLength = s.length();
        // 最后一位不涉及大小比较
        int result = mapping[s.charAt(sLength - 1)];

        for(int i = sLength-2; i >= 0; --i){
            int cur = mapping[s.charAt(i)];
            int right = mapping[s.charAt(i+1)];
            if(cur < right){ result -= cur; }
            else{ result += cur; }
        }
        return result;
    }

}
