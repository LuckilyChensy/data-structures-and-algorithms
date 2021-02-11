package com.leetcode.no1799;

import com.leetcode.bean.ListNode;

public class Solution02 {

    public ListNode deleteNode(ListNode head, int val){

        if(head == null){ return null; }
        if(head.val == val){ return head.next; }

        ListNode pre = head;
        ListNode cur = head.next;

        while(cur!=null && cur.val!=val){
            pre=cur;
            cur = cur.next;
        }

        if(cur!=null){
            pre.next = cur.next;
        }

        return head;

    }

}
