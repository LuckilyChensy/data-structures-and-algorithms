package com.leetcode.no1799;

import com.leetcode.bean.ListNode;

public class Solution01 {

    public ListNode deleteNode(ListNode head, int val){

        ListNode cur = head;

        while(cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }

        return head;
    }

}
