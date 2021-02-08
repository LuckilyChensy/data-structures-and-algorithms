package com.leetcode.no0120;

import java.util.List;

public class Solution02 {
    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size(); // 行数
        int[] dp = new int[n];

        dp[0] = triangle.get(0).get(0);

        for(int i = 1; i < n; i++){

            int pre = dp[0];
            dp[i] = dp[i-1] + triangle.get(i).get(i);
            dp[0] = dp[0] + triangle.get(i).get(0);

            for(int j = 1; j < i; ++j){
                int tmp = dp[j];
                dp[j] = Math.min(pre,dp[j]) + triangle.get(i).get(j);
                pre = tmp;
            }
        }

        int min = dp[0];

        for(int i = 1; i < n; i++){
            min = Math.min(min,dp[i]);
        }

        return min;
    }
}
