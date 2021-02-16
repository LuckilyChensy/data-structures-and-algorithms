package com.leetcode.no0138;

import bean.Node;

import java.util.HashMap;

public class Solution01 {

    HashMap<Node,Node> visitedHash = new HashMap<Node,Node>();

    public Node copyRandomList(Node head){

        if(head == null){
            return null;
        }

        if(this.visitedHash.containsKey(head)){
            return this.visitedHash.get(head);
        }

        Node node = new Node(head.val,null,null);

        this.visitedHash.put(head,node);

        node.next = this.copyRandomList(head.next);
        node.random = this.copyRandomList(head.random);

        return node;
    }
}
