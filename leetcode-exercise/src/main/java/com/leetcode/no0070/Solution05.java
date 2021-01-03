package com.leetcode.no0070;

import java.util.HashMap;
import java.util.Map;

public class Solution05 {

    Map<Integer,Integer> map = new HashMap<>();

    public int climbStairs(int n) {

        if(n == 1){
            map.put(1,1);
            return 1;
        }

        if(n == 2){
            map.put(2,2);
            return 2;
        }

        if(map.get(n) != null){
            return map.get(n);
        }else{
            int result = climbStairs(n-1)+climbStairs(n-2);
            map.put(n,result);
            return result;
        }

    }

}
