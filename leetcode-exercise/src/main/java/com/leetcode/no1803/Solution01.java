package com.leetcode.no1803;

import com.leetcode.bean.ListNode;

public class Solution01 {

    public ListNode getKthFromEnd(ListNode head, int k){

        ListNode former = head;
        ListNode latter = head;

        while(k>0){
            former = former.next;
            k--;
        }

        while(former != null){
            former = former.next;
            latter = latter.next;
        }

        return latter;
    }

}
