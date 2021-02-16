package com.leetcode.no0019;

import bean.ListNode;

public class Solution01 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode p = dummy;
        ListNode q = dummy;

        for(;n>0&&q.next != null; --n){
            q = q.next;
        }

        // 如果 n 超过链表的长度
        if(n!=0){
            return dummy.next;
        }

        // 两个指针相隔为n,一起往后移动
        while(q.next != null){
            p = p.next;
            q = q.next;
        }

        p.next = p.next.next;
        return dummy.next;
    }
}
