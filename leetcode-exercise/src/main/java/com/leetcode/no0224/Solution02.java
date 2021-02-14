package com.leetcode.no0224;

import com.leetcode.bean.ListNode;

public class Solution02 {

    public ListNode swapPairs(ListNode head){

        // 必须存在至少两个节点
        if(head == null || head.next == null){
            return head;
        }

        ListNode node = new ListNode(-1);
        ListNode result = node;

        while(head!=null && head.next != null){
            node.next = head.next;
            head.next = head.next.next;
            node.next.next = head;

            node = node.next.next;
            head = head.next;
        }

        return result;
    }
}
