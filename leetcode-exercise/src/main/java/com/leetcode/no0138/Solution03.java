package com.leetcode.no0138;

import java.util.HashMap;
import java.util.Map;

public class Solution03 {

    public RandomListNode copyListWithRandomPointer(RandomListNode head){

        if(head == null){
            return null;
        }

        Map<RandomListNode,RandomListNode> map = new HashMap<>();

        RandomListNode copyHead = new RandomListNode(head.val);

        map.put(head,copyHead);

        for(RandomListNode p = head.next,q = copyHead; p!=null;p = p.next,q=q.next ){
            q.next = new RandomListNode(p.val);
            map.put(p,q.next);
        }

        for(RandomListNode p = head,q = copyHead; p!=null;p = p.next,q = q.next){
            if(p.random != null){
                q.random = map.get(p.random);
            }
        }

        return copyHead;
    }

}

class RandomListNode{

    int val;

    RandomListNode next,random;

    RandomListNode(int x){
        this.val = x;
    }

}
