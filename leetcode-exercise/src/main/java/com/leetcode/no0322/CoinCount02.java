package com.leetcode.no0322;

/**
 * 极客时间专栏 硬币问题 02
 * 引入回溯法解决过于贪心的问题
 */
public class CoinCount02 {

    private static int getMinCoinCountOfValue(int total,int[] values,int valueIndex){

        int valueType = values.length;

        // 存在给定的目标值无法拼接的问题
        if(valueIndex == valueType){ return Integer.MAX_VALUE; }

        int minResult = Integer.MAX_VALUE;  // 默认找不到匹配的方案
        int currentValue = values[valueIndex];  // 当前币种
        int maxCount = total/currentValue;  // 当前币种所能使用的最大数量

        for(int count = maxCount; count >= 0; count--){

            int rest = total - count * currentValue;

            // 如果rest为0，表示余额已除尽，组合完成
            if(rest == 0){
                minResult = Math.min(minResult,count);
                break;
            }

            // 否则尝试用剩余面值求当前余额的硬币总数
            int restCount = getMinCoinCountOfValue(rest,values,valueIndex + 1);


            if(restCount == Integer.MAX_VALUE){
                // 如果当前面值已经为 0 , 返回 -1 表示失败
                if(count == 0){ break; }
                continue;
            }

            minResult = Math.min(minResult,count+restCount);
        }

        return minResult;

    }

    /**
     * @param total
     * @param values
     * @param k 当前处于第几种硬币类型
     * @return
     */
    private static int getMinCoinCountLoop(int total,int[] values,int k){
        // 默认不存在
        int minCount = Integer.MAX_VALUE;
        int valueCount = values.length;

        if(k == valueCount){
            return Math.min(minCount,getMinCoinCountOfValue(total,values,0));
        }

        for(int i = k; i <= valueCount - 1; i++){
            // k位置已经排列好
            int t = values[k];
            values[k] = values[i];
            values[i]=t;
            minCount = Math.min(minCount, getMinCoinCountLoop(total, values, k + 1));
            // 考虑后一位 // 回溯
            t = values[k];
            values[k] = values[i];
            values[i]=t;
        }

        return minCount;
    }

    public static void main(String[] args) {
        int values[] = {5,3};
        int total = 11;
        int minCoin = getMinCoinCountLoop(total, values, 0);
        System.out.println((minCoin == Integer.MAX_VALUE) ? -1 : minCoin);
    }

}
