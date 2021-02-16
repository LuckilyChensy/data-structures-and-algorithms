package com.leetcode.no0224;

import bean.ListNode;

public class Solution01 {

    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode headNext = head.next;
        ListNode subResult = swapPairs(headNext.next);
        headNext.next = head;
        head.next = subResult;
        return headNext;

    }

}
