package com.leetcode.no0020;

import java.util.Stack;

public class Solution01 {

    public boolean isValid(String s){

        // 处理边界条件
        if(s == null){
            return true;
        }

        Stack<Character> stack = new Stack<Character>();

        for(char c: s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }else if(c == '{'){
                stack.push('}');
            }else if(c == '['){
                stack.push(']');
            }else if(stack.isEmpty()||c!=stack.pop()){
                return false;
            }
        }

        return stack.isEmpty();

    }

}
