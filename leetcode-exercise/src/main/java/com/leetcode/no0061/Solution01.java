package com.leetcode.no0061;

import com.leetcode.bean.ListNode;

public class Solution01 {

    public ListNode rotateRight(ListNode head, int k) {

        // 处理边界条件
        if(head == null || head.next == null || k <=0){
            return head;
        }

        ListNode end = head;
        int n = 1;

        for(;end.next != null; end = end.next){
            ++n;
        }
        end.next = head;

        k %= n;
        ListNode  newEnd = head;

        for(int i = 0; i < n-k-1; ++i){
            newEnd = newEnd.next;
        }

        ListNode newHead = newEnd.next;
        newEnd.next = null;

        return newHead;
    }

}
