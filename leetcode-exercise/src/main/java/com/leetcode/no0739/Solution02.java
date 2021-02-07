package com.leetcode.no0739;

import java.util.Stack;

public class Solution02 {

    public int[] dailyTemperatures(int[] T) {

        int n = T.length;

        int[] result = new int[n];

        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i < n; ++i){
            while(!stack.empty() && T[stack.peek()] < T[i]){
                int idx = stack.pop();
                result[idx]  = i - idx;
            }
            stack.push(i);
        }

        while(!stack.empty()){
            result[stack.pop()] = 0;
        }

        return result;
    }

}
