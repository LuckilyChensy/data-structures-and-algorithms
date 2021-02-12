package com.leetcode.no1810;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack ;
    Stack<Integer> minStack ;

    public MinStack(){
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int x){
        stack.add(x);
        if(minStack.empty() || minStack.peek() >= x){
            minStack.add(x);
        }
    }

    public void pop(){
        if(stack.pop().equals(minStack.peek())){
            minStack.pop();
        }
    }

    public int top(){
        return stack.peek();
    }

    public int min(){
        return minStack.peek();
    }

}
