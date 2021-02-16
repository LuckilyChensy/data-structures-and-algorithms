package com.leetcode.no0141;

import bean.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution01 {

    public boolean hasCycle(ListNode head) {

        Set<ListNode> set = new HashSet<>();

        for(ListNode p = head; p!=null; p = p.next){

            if(set.contains(p)){
                return true;
            }

            set.add(p);

        }

        return false;
    }

}
