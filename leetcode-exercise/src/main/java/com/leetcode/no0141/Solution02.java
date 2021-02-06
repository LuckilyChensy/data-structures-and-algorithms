package com.leetcode.no0141;

import com.leetcode.bean.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution02 {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }

        return false;
    }

}
