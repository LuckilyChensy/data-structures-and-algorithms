package com.leetcode.no0633;

import java.util.HashSet;
import java.util.Set;

public class Solution02 {

    // 判断是否为整数次幂
    public boolean isSquare(int num){
        int n = (int)Math.sqrt(num);    // 如果非整数被取整,则重新平方后无法相等
        return n * n == num;
    }

    public boolean judgeSquareSum(int c) {

        int n = (int)Math.sqrt(c);

        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i <= n; i++){
            set.add(i * i);
            if(set.contains(c - i*i)){
                return true;
            }
        }

        return false;
    }

}
