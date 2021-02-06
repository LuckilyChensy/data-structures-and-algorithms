package com.leetcode.no0003;

import java.util.HashSet;
import java.util.Set;

public class Solution01 {

    public int lengthOfLongestSubstring(String s) {

        // 哈希集合,用于记录是否为当前窗口内的重复元素
        Set<Character> winElement = new HashSet<Character>();

        int strLength = s.length();

        // 右指针, 初始值为 -1, 相当于在字符串左边界的左侧,还没有开始移动
        int rightK = -1;
        int maxLength = 0;

        // 左指针向右移动时，移除一个字符
        for(int leftK = 0; leftK < strLength; leftK++){

            if(leftK != 0){
                winElement.remove(s.charAt(leftK-1));
            }
            // 未到边界 且 窗口内无重复子串时
            while(rightK+1<strLength && !winElement.contains(s.charAt(rightK+1))){
                // 不断移动右指针
                winElement.add(s.charAt(rightK+1));
                ++rightK;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            maxLength = Math.max(maxLength,rightK-leftK+1);
        }

        return maxLength;
    }

}
