package com.leetcode.no0142;

import bean.ListNode;

public class Solution02 {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(true){

            if(fast == null || fast.next == null){ return null; }

            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){ break; }

        }

        fast = head;

        while(fast!=slow){
            slow = slow.next;
            fast = fast.next;
        }

        return fast;

    }
}
