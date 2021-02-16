package com.leetcode.no0138;

import bean.Node;

import java.util.HashMap;

public class Solution02 {

    HashMap<Node, Node> visited = new HashMap<Node,Node>();

    public Node getCloneNode(Node node){

        if(node != null){

            if(this.visited.containsKey(node)){
                return this.visited.get(node);
            }else{
                this.visited.put(node,new Node(node.val,null,null));
                return this.visited.get(node);
            }

        }

        return null;
    }

    public Node copyRandomList(Node head){

        if(head == null){
            return null;
        }

        Node oldNode = head;

        Node newNode = new Node(oldNode.val);

        this.visited.put(oldNode,newNode);

        while(oldNode != null){
            newNode.random =  this.getCloneNode(oldNode.random);
            newNode.random = this.getCloneNode(oldNode.next);

            oldNode = oldNode.next;
            newNode = newNode.next;
        }

        return this.visited.get(head);

    }
}
