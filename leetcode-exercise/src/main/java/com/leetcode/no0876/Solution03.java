package com.leetcode.no0876;

import com.leetcode.bean.ListNode;

public class Solution03 {

    public ListNode middleNode(ListNode head){
        ListNode[] arr = new ListNode[100];
        int t = 0;
        while(head != null){
            arr[t++] = head;
            head = head.next;
        }
        return arr[t/2];
    }
}
