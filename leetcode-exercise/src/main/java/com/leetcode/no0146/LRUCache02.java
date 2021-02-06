package com.leetcode.no0146;

import java.util.HashMap;
import java.util.Map;

// 哈希链表结构，循环链表方式
public class LRUCache02 {

    private class Node{

        int key;
        int val;
        Node prev;
        Node next;

        public Node(int key, int val, Node prev, Node next) {
            this.key = key;
            this.val = val;
            this.prev = prev;
            this.next = next;
        }

    }

    // 初始化 Hash 表头节点
    private Node head = new Node(-1,-1,null,null);
    // 哈希索引链表目标节点地址, 当前需要寻找的值在链表中的地址
    private Map<Integer,Node> map = new HashMap<Integer,Node>();

    // 定义将节点移动到头节点的函数
    private void move2Head(Node cur){

        if(cur == head){
            head = head.prev;
            return ;
        }

        // detach
        cur.prev.next = cur.next;
        cur.next.prev = cur.prev;
        // attach
        cur.next = head.next;
        cur.next.prev = cur;

        head.next = cur;
        cur.prev  = head;

    }

    // 构建双向循环链表
    public LRUCache02(int capacity){

        Node cur = head;

        for(int i = 0; i < capacity - 1; ++i){
            // 指向新建节点,并将新建节点的前向指针指向 cur
            cur.next = new Node(-1,-1,cur,null);
            // cur 移动到新的节点
            cur = cur.next;
        }

        // 构建循环链表
        cur.next = head;
        head.prev = cur;

    }

    public int get(int key,int value){
        if(!map.containsKey(key)){ return -1;}
        Node cur = map.get(key);
        move2Head(cur);
        return cur.val;
    }

    public void put(int key,int value){
        // 已有的值需要更新
        if(map.containsKey(key)){
            Node cur = map.get(key);
            cur.val = value;
            move2Head(cur);
        }else{
            if(head.val != -1){ map.remove(head.key); }
            head.key = key;
            head.val = value;
            map.put(key,head);
            head = head.prev;
        }
    }

}
