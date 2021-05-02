package com.leetcode.no1206;

/**
 * @Author： bugest
 * @Description:
 * @Date:Created in 8:28 2021/5/2
 * @Modified By:
 */
public class SkipList {

    private static final double SKIPLIST_P=0.25;
    private static final int MAX_LEVEL = 32;

    public SkipList(){}

    class Node{

        Integer value;
        Node[] next;

        public Node(Integer value,int size){
            this.value = value;
            next = new Node[size];
        }

    }
}
