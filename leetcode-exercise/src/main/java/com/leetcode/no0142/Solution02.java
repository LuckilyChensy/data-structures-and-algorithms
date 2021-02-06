package com.leetcode.no0142;

import com.leetcode.bean.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution02 {
    public ListNode detectCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){

            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                for(ListNode p = head; p != slow; p = p.next,slow = slow.next){
                    return slow;
                }
            }
        }
        return null;
    }
}
