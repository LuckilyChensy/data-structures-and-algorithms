package com.leetcode.no0234;

import com.leetcode.bean.ListNode;

public class Solution04 {

    public boolean isPalindrome(ListNode head){

        ListNode cur = head;

        int base = 11;
        int mod = 1000000007;

        int left = 0;
        int right = 0;
        int mul = 1;

        while(cur != null){
            left = (int)(((long)left * base + cur.val)%mod);
            right = (int)((right + (long)mul * cur.val)%mod);
            mul = (int)((long)mul * base % mod);
            cur = cur.next;
        }

        return left == right;
    }

}
