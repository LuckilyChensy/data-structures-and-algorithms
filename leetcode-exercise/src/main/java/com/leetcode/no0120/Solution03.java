package com.leetcode.no0120;

import java.util.List;

/**
 * 自底向上解法
 */
public class Solution03 {

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        for(int j = 0; j < n; ++j){
            dp[j] = triangle.get(n-1).get(j);
        }
        for(int i = n-2; i >= 0 ; --i){
            for(int j = 0;  j <= i; ++j){
                dp[j] = Math.min(dp[j],dp[j+1])+triangle.get(i).get(j);
            }
        }
        return dp[0];
    }

}
