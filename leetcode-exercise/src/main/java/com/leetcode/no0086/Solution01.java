package com.leetcode.no0086;

import com.leetcode.bean.ListNode;

public class Solution01 {

    public ListNode partitionAndPreserveOrder(ListNode head, int x){

        if(head == null){
            return null;
        }

        ListNode smaller = new ListNode(0);
        ListNode greater = new ListNode(0);

        ListNode ps = smaller;
        ListNode pg = greater;

        for(ListNode p = head; p!=null;p=p.next){
            if(p.val<x){
                ps.next = p;
                ps = ps.next;
            }else{
                pg.next = p;
                pg = pg.next;
            }
        }

        ps.next = greater.next;
        pg.next = null;
        return smaller.next;
    }
}
