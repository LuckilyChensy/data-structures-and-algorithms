package com.leetcode.no1777;

import bean.ListNode;

import java.util.Stack;

public class Solution01 {

    public int[] reversePrint(ListNode head){

        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;

        while(temp != null){
            stack.push(temp);
            temp = temp.next;
        }

        int size = stack.size();
        int[] print = new int[size];

        for(int i = 0; i < size; i++){
            print[i] = stack.pop().val;
        }

        return print;
    }
}
