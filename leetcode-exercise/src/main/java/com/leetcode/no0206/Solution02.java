package com.leetcode.no0206;

import com.leetcode.bean.ListNode;

public class Solution02 {

    public ListNode reverseList(ListNode head){

        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

}
