package com.leetcode.no0155;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {

    Deque<Integer> stack = null;
    Deque<Integer> minStack = null;

    public MinStack(){
        stack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x){
        stack.push(x);
        minStack.push(Math.min(minStack.peek(),x));
    }

    public void pop(){
        stack.pop();
        minStack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }

}
