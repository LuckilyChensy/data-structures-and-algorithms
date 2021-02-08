package com.leetcode.no0322;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 极客时间专栏 硬币问题 03
 * 递归求解硬币问题
 */
public class CoinCount03 {

    private static void getMinCountHelper(int total, int[] values, ArrayList currentCounts, ArrayList<ArrayList<Integer>> combinations){

        if(0 == total){
            combinations.add(new ArrayList<Integer>(currentCounts));
            return;
        }

        int valueLength = values.length;

        // 遍历所有面值
        for(int i = 0; i < valueLength; i++){
            int currentValue = values[i];
            if(currentValue > total){
                continue;
            }

            // 否则在当前值数量组合上的对应位置加1
            ArrayList<Integer> newCounts = new ArrayList<Integer>(currentCounts);
            newCounts.set(i,newCounts.get(i) + 1);
            int rest = total - currentValue;

            getMinCountHelper(rest,values,newCounts,combinations);
        }

    }

    private static int getMinimumHelper(ArrayList<ArrayList<Integer>> combinations){
        // 如果没有可用的组合,返回 -1
        if(0 == combinations.size()){ return -1; }

        int minCount = Integer.MAX_VALUE;

        for(ArrayList<Integer> counts:combinations){
            int total = 0;
            for(int count:counts){ total += count; }
            if(total < minCount){ minCount = total; }
        }

        return minCount;
    }

    public static void main(String[] args) {

        int values[] = {5,3};
        int total = 11;

        ArrayList<Integer> initialCounts = new ArrayList<>(Collections.nCopies(values.length, 0));

        ArrayList<ArrayList<Integer>> coinCombinations = new ArrayList<>();

        getMinCountHelper(total,values,initialCounts,coinCombinations);

    }

}
