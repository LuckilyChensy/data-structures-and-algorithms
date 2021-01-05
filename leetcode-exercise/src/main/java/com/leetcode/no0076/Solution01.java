package com.leetcode.no0076;

//给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
//
// 注意：如果 s 中存在这样的子串，我们保证它是唯一的答案。
//
//
//
// 示例 1：
//
//
//输入：s = "ADOBECODEBANC", t = "ABC"
//输出："BANC"
//
//
// 示例 2：
//
//
//输入：s = "a", t = "a"
//输出："a"
//
//
//
//
// 提示：
//
//
// 1 <= s.length, t.length <= 105
// s 和 t 由英文字母组成

public class Solution01 {

        public String minWindow(String s, String t) {
            //
            if(s == null || s.length() == 0 || t == null || t.length() == 0){
                return "";
            }

            int[] need = new int[128];

            // 记录需要的字符个数
            for(int i = 0; i < t.length();i++){
                need[t.charAt(i)]++;
            }
            // 通过改变i,j来扩展和收缩滑动窗口
            int left = 0;
            int right = 0;

            int size = Integer.MAX_VALUE;
            int count = t.length();
            int start = 0;

            // 遍历所有字符
            while(right < s.length()){

                char c = s.charAt(right);

                if(need[c]>0){
                    count--;
                }

                need[c]--;

                if(count == 0){
                    while(left < right && need[s.charAt(left)] < 0){
                        need[s.charAt(left)]++;
                        left++;
                    }
                    // 不能右移时候挑战最小窗口大小，更新最小窗口开始的start
                    if(right - left + 1 < size){
                        size = right - left + 1;
                        start = left;
                    }

                    need[s.charAt(left)]++;
                    left++;
                    count++;
                }
                right++;
            }
            return size == Integer.MAX_VALUE?"":s.substring(start,start+size);
        }

}
