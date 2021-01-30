package com.leetcode.no0021;

import com.leetcode.bean.ListNode;

public class Solution01 {

    // Time:O(m+n) Space:O(1)

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1 == null){
                return l2;
            }else if(l2 == null){
                return l1;
            }else if(l1.val < l2.val){
                l1.next = mergeTwoLists(l1.next,l2);
                return l1;
            }else{
                l2.next = mergeTwoLists(l2.next,l1);
                return l2;
            }
    }

}
