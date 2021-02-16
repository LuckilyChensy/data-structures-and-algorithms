package com.leetcode.no1817;

import bean.Node;

import java.util.HashMap;

public class Solution01 {

    public Node copyRandomList(Node head) {

        HashMap<Node,Node> map = new HashMap<Node,Node>();
        Node cur = head;

        while(cur!=null){
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }

        cur = head;
        while(cur!=null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(head);
    }

}
