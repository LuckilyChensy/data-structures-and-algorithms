package com.leetcode.no0070;

/**
 * 朴素解法
 * 求解高层的内容,需要底层的信息,因此使用函数调用时的系统栈,暂存各层内容,并在表达式种维护各层之间的关联
 * */
public class Solution01 {

    public int climbStairs(int n) {
        if(n <= 2){ return n;  } // 恰好  0->0, 1->1, 2->2
        return climbStairs(n-1) + climbStairs(n-2);
    }

}
