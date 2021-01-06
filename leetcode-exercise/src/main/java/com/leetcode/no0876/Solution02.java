package com.leetcode.no0876;

import com.leetcode.bean.ListNode;

public class Solution02 {
    public ListNode middleNode(ListNode head) {
        ListNode fast = null;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

}
