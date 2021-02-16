package com.leetcode.no0206;

import bean.ListNode;

public class Solution02 {

    public ListNode reverseList(ListNode head) {

        // 边界条件翻盘 && 递归结束条件判断
        if(head == null || head.next == null){
            return head;
        }

        ListNode cur = reverseList(head.next);
        // 当前节点是 head , 利用栈保存上一节点的位置, 讲下一节点的指向反转
        head.next.next = head;
        head.next = null;

        return cur;

    }

}
