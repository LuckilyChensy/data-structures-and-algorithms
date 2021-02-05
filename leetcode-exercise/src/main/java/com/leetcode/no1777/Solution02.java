package com.leetcode.no1777;

import com.leetcode.bean.ListNode;

import java.util.ArrayList;
import java.util.Stack;

public class Solution02 {

    public int[] reversePrint(ListNode head){

        ArrayList<Integer> tmp = new ArrayList<Integer>();

        public int[] reversePrint(ListNode head){
            recur(head);
            int[]  res = new int[tmp.size()];
            for(int i = 0; i < res.length; i++){
                res[i] = tmp.get(i);
            }
            return res;
        }

        void recur(ListNode head){

            if(head == null){
                return null;
            }

            recur(head.next);
            tmp.add(head.val);
        }
    }
}
