package com.leetcode.no0003;

public class Solution02 {

    public int lengthOfLongestSubstring(String s) {
        // 索引代表字符的ASCII,记录字符出现的次数
        int[] counts = new int[256];
        int i = 0;
        int j = 0;
        int maxLen = 0;

        for(;i<s.length();i++){
            for(;j<s.length();j++){
                // 若出现重复字符则，结束循环
                if(counts[s.charAt(j)] != 0){ break; }
                // 若不是重复字符，则新增记录字符
                counts[s.charAt(j)] += 1;
            }
            maxLen = Math.max(maxLen,j-i);
            // 左指针在下一个动作移动,因此需要从数组中移除
            counts[s.charAt(i)] -= 1;
        }
        return maxLen;
    }

}
