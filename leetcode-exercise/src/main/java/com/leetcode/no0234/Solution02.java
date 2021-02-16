package com.leetcode.no0234;

import bean.ListNode;

import java.util.Stack;

public class Solution02 {

    // Time:O(n) Space:O(n)
    public boolean isPalindrome(ListNode head){

        Stack<Integer> stack = new Stack<>();

        for(ListNode p = head; p != null; p = p.next){
            stack.push(p.val);
        }

        for(ListNode p = head; p != null; p = p.next){
            if(p.val != stack.pop()){
                return false;
            }
        }

        return true;

    }

}
