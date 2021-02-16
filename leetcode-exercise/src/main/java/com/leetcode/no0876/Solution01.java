package com.leetcode.no0876;

import bean.ListNode;

public class Solution01 {

    public ListNode middleNode(ListNode head) {

        ListNode p = head;

        int len = 0;

        for(;p!=null;p = p.next){
            len++;
        }

        p = head;

        for(int i = 0; i <len/2; i++){
            p = p.next;
        }

        return p;
    }
}
