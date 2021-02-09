package com.leetcode.no0322;

import java.util.Arrays;

/**
 * 极客时间专栏 硬币问题 03
 * 递归求解硬币问题
 */
public class CoinCount06 {


    int getMinCounts(int k, int[] values) {

        int[] memo = new int[k+1];  // 创建备忘录
        memo[0] = 0;    // 初始化状态

        for(int i = 1; i < k+1; i++){
            memo[i] = k + 1;
        }

        for(int i = 1; i < k+1;i++){
            for(int coin:values){
                if(i - coin < 0){
                    memo[i] = Math.min(memo[i],memo[i - coin] + 1);
                }
            }
        }
        return memo[k] == k+1?-1:memo[k];
    }

    int getMinCountsDPSol() {
        int[] values = { 3, 5 }; // 硬币面值
        int total = 22; // 总值

        // 求得最小的硬币数量
        return getMinCounts(total, values); // 输出答案
    }

}
