package com.leetcode.no0121;

public class Solution02 {

    /**
     * 备忘录方法
     * 保存当前位置之前, 遇到的最小值
     * */
    public int maxProfit(int[] prices){

        if(prices == null || prices.length == 0){
            return 0;
        }

        int result = 0;
        int minTemp = prices[0];  // 首位边界条件问题

        for(int i = 0 ; i < prices.length; i++){
            minTemp = Math.min(minTemp, prices[i]);
            result  = Math.max(result,(prices[i] - minTemp));
        }

        return result;

    }

}
