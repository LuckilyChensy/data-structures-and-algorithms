package com.leetcode.no0142;

import bean.ListNode;
import java.util.HashSet;
import java.util.Set;

public class Solution01 {

    public ListNode detectCycle(ListNode head){
        Set<ListNode> set = new HashSet<>();
        for(ListNode p = head; p != null; p = p.next){
            if(set.contains(p)){
                return p;
            }
            set.add(p);
        }
        return null;
    }

}
