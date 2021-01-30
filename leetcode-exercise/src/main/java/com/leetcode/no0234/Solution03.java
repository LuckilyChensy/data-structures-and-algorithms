package com.leetcode.no0234;

import com.leetcode.bean.ListNode;

public class Solution03 {

    // Time:O(n) Space:O(1)
    public boolean isPalindrome(ListNode head){

        int len = 0;

        for(ListNode p = head; p != null; p = p.next,++len);

        ListNode cur = head;
        ListNode pre = null;

        for(int i = 0; i < len/2; ++i){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        if(len % 2 == 1){
            cur = cur.next;
        }

        for(;pre != null && cur != null ; pre = pre.next,cur = cur.next){
            if(pre.val != cur.val){
                return false;
            }
        }

        return true;

    }

}
