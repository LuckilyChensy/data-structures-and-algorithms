package com.leetcode.no0032;
/**
 * Algocasts
 */
public class Solution01 {

    // Time: O(n),Space:O(n)
    public int maxLengthOfValidParenthesesStack(String s){
        if(s == null || s.length() == 0){
            return 0;
        }

        int n = s.length();
        int p = -1;
        int max = 0;

        int[] st = new int[n+1];
        st[++p] = -1;

        for(int i = 0; i < n; ++i){
            if(st[p]!=-1 && s.charAt(st[p]) == '(' && s.charAt(i) == ')'){
                --p;
                max = Math.max(max,i-st[p]);
            }else{
                st[++p] = i;
            }
        }

        return max;
    }
}
