package com.leetcode.no0202;

import java.util.HashSet;
import java.util.Set;

/**
 * 假如数据一直往下走，但是不出现 1 , 说明一定是一个环状的无线循环
 */
public class Solution01 {

    public boolean isHappy(int n) {
        // 存储已经出现过的数据
        Set<Integer> seen = new HashSet<Integer>();
        seen.add(n);
        //
        while(n != 1){
            n = bitSquareSum(n);
            if(!seen.add(n)){
                return false;   // 如果出现了，说明有环形成，将永远死循环
            }
        }
        return true;
    }

    // 求解各个位数的平方和
    public int bitSquareSum(int x){

        int sum = 0;
        int cur ;

        while(x > 0){
            cur = x%10;
            sum += cur * cur;
            x= x/10;
        }

        return sum;
    }

}
