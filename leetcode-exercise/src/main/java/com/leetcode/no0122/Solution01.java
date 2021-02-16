package com.leetcode.no0122;

public class Solution01 {

    /**
     * 暴力解法
     * 每次都买在上升的起始点和结束点
     */
    public int maxProfit(int[] prices) {

        if(prices == null || prices.length == 0){
            return 0;
        }

        int result = 0;
        int start = 0; // 记录每个上升段的起始点
        int end = 0;   // 记录每个上升段的结束点
        int i = 0;

        while(i < prices.length-1){

            start = end = prices[i];

            int j = i+1;

            for(; j < prices.length; j++){
                if(prices[j] > prices[j-1]) {
                    end = prices[j];
                    continue;
                }else{
                    break;
                }
            }
            result += end - start;
            i = j;
        }

        return result;
    }

}
