package com.leetcode.no0234;

import bean.ListNode;

public class Solution04 {

    // 回文数反转之后不变，一个正向计算哈希值，一个反向计算哈希值，比较反转之前和反转之后的哈希值是否相等
    public boolean isPalindrome(ListNode head) {

        long hash1 = 0;
        long hash2 = 0;
        long h = 1;
        long seed = (long)(1e9+7);

        ListNode cur = head;
        while(cur != null){
            hash1 = hash1 * seed + cur.val;
            hash2 = hash2 + cur.val * h;
            h *= seed;
            cur = cur.next;
        }
        return hash1 == hash2;
    }

}
