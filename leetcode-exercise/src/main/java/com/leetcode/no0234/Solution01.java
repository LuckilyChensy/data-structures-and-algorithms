package com.leetcode.no0234;

import com.leetcode.bean.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {

    public boolean isPalindrome(ListNode head){

        List<Integer> vals = new ArrayList<Integer>();

        // 将链表复制到数组中
        ListNode currentNode = head;
        while(currentNode != null){
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        // 使用双指针判断回文数
        int front = 0;
        int back = vals.size() - 1;

        while(front < back){
            if(!vals.get(front).equals(vals.get(back))){
                return false;
            }
            front++;
            back--;
        }

        return true;

    }

}
