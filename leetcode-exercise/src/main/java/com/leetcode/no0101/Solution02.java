package com.leetcode.no0101;

import com.leetcode.bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution02 {

    public boolean isSymmetric(TreeNode root){

        return check(root,root);
    }

    private boolean check(TreeNode l,TreeNode r){

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(l);
        q.offer(r);
        while(!q.isEmpty()){

            l=q.poll();
            r=q.poll();

            if(l == null && r == null){
                return true;
            }

            if(l == null || r ==null || (l.val != r.val)){
                return false;
            }

            q.offer(l.left);
            q.offer(r.right);

            q.offer(l.right);
            q.offer(r.left);
        }
        return true;
    }

}
