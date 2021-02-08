package com.leetcode.no0322;

/**
 * 极客时间专栏 硬币问题 01
 * 每次都取最大的值，但并不是每次都合适
 */
public class CoinCount01 {

    private static int getMinCoinCountHelper(int total,int[] values){

        int rest = total;
        int count = 0;

        for(int i = 0; i < values.length; i++){
            // 计算使用当前面值的最多能用几个
            int currentCount = rest/values[i];
            // 计算使用完当前面值后的余额
            rest -= currentCount * values[i];
            // 硬币使用量计数
            count += currentCount;

            if(rest == 0){
                return count;
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int values[] = {5,3};
        int total = 11;
        System.out.println(getMinCoinCountHelper(total, values));
    }

}
