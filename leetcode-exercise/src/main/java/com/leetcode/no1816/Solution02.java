package com.leetcode.no1816;

import java.util.Stack;

public class Solution02 {

    public boolean validateStackSequences(int[] pushed,int[] popped){

        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;

        for(int element:pushed){
            stack.push(element);
            while(!stack.isEmpty() && stack.peek()==popped[i]){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }

}
