package com.leetcode.no1777;

import bean.ListNode;

import java.util.ArrayList;

public class Solution02 {

    ArrayList<Integer> tmp = new ArrayList<Integer>();

    public int[] reversePrint(ListNode head){
        recur(head);
        int[]  res = new int[tmp.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = tmp.get(i);
        }
        return res;
    }

    void recur(ListNode head){

        if(head == null){
            return;
        }

        recur(head.next);
        tmp.add(head.val);
    }

}
