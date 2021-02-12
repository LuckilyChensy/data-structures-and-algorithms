package com.leetcode.no1811;

import java.util.Stack;

public class Solution01 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;

        for(int num:pushed){
            stack.push(num);
            if(!stack.isEmpty() && stack.peek() == popped[i]){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }

}
