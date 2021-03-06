package com.leetcode.no0086;

import bean.ListNode;

public class Solution01 {

    public ListNode partition(ListNode head, int x){

        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);

        ListNode p1 = dummy1;
        ListNode p2 = dummy2;

        while(head != null){
            if(head.val < x){
                p1.next = head;
                p1 = p1.next;
            }else{
                p2.next = head;
                p2 = p2.next;
            }
            head = head.next;
        }

        p1.next = dummy2.next;
        p2.next = null;
        return dummy1.next;
    }
}
