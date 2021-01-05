package com.leetcode.no0647;

/**
 * 对一个字符串 ababa，选择最中间的 a 作为中心点，往两边扩散，第一次扩散发现 left 指向的是 b，right 指向的也是 b，所以是回文串，继续扩散，同理 ababa 也是回文串
 * 确定了一个中心点后的寻找的路径，只要寻找到所有的中心点，问题就解决了。
 *
 */
public class Solution03 {

    public int countSubstrings(String s){
        int ans = 0;
        for(int center = 0; center < 2 * s.length()-1;center++){
            int left = center/2;
            int right = left+center%2;

            while(left>=0&&right<s.length()&&s.charAt(left) == s.charAt(right)){
                ans++;
                left--;
                right++;
            }
        }
        return ans;
    }
}
